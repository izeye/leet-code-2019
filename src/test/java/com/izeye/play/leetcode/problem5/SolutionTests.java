package com.izeye.play.leetcode.problem5;

import java.util.function.Consumer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void longestPalindrome() {
		Solution solution = new Solution();

		Consumer<String> assertion1 = (palindrome) -> assertThat(palindrome).isEqualTo("bab");
		Consumer<String> assertion2 = (palindrome) -> assertThat(palindrome).isEqualTo("aba");
		assertThat(solution.longestPalindrome("babad")).satisfiesAnyOf(assertion1, assertion2);

		assertThat(solution.longestPalindrome("cbbd")).isEqualTo("bb");
	}

	@Test
	public void longestPalindromeWhenStringIsSingleCharacter() {
		Solution solution = new Solution();
		assertThat(solution.longestPalindrome("a")).isEqualTo("a");
	}

	@Test
	public void longestPalindromeWhenStringIsTwoCharacters() {
		Solution solution = new Solution();

		Consumer<String> assertion1 = (palindrome) -> assertThat(palindrome).isEqualTo("a");
		Consumer<String> assertion2 = (palindrome) -> assertThat(palindrome).isEqualTo("c");
		assertThat(solution.longestPalindrome("ac")).satisfiesAnyOf(assertion1, assertion2);
	}

	@Test
	public void longestPalindromeWhenStringIsEmpty() {
		Solution solution = new Solution();
		assertThat(solution.longestPalindrome("")).isEqualTo("");
	}

	@Test
	public void isPalindrome() {
		String string = "bab";
		assertThat(Solution.isPalindrome(string.toCharArray(), 0, string.length() - 1)).isTrue();

		string = "aba";
		assertThat(Solution.isPalindrome(string.toCharArray(), 0, string.length() - 1)).isTrue();

		string = "bb";
		assertThat(Solution.isPalindrome(string.toCharArray(), 0, string.length() - 1)).isTrue();
	}

}
