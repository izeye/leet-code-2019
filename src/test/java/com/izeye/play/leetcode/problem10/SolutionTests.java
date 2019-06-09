package com.izeye.play.leetcode.problem10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void isMatch() {
		Solution solution = new Solution();
		assertThat(solution.isMatch("aa", "a")).isFalse();
		assertThat(solution.isMatch("aa", "a*")).isTrue();
		assertThat(solution.isMatch("ab", ".*")).isTrue();
		assertThat(solution.isMatch("aab", "c*a*b")).isTrue();
		assertThat(solution.isMatch("mississippi", "mis*is*p*.")).isFalse();
		assertThat(solution.isMatch("aaa", "aaaa")).isFalse();
	}

	@Test
	public void isMatchWithFailedTestCases() {
		Solution solution = new Solution();
		assertThat(solution.isMatch("aaa", "aaaa")).isFalse();
		assertThat(solution.isMatch("mississippi", "mis*is*ip*.")).isTrue();
		assertThat(solution.isMatch("ab", ".*c")).isFalse();
		assertThat(solution.isMatch("aaa", "a*a")).isTrue();
		assertThat(solution.isMatch("aaa", "ab*a*c*a")).isTrue();
		assertThat(solution.isMatch("bbbba", ".*a*a")).isTrue();
	}

}
