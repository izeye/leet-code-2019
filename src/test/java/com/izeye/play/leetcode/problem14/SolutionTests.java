package com.izeye.play.leetcode.problem14;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void longestCommonPrefix() {
		Solution solution = new Solution();
		assertThat(solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" })).isEqualTo("fl");
		assertThat(solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" })).isEmpty();
	}

	@Test
	public void longestCommonPrefixWhenStringArrayIsEmptyShouldReturnEmptyString() {
		Solution solution = new Solution();
		assertThat(solution.longestCommonPrefix(new String[] {})).isEmpty();
	}

	@Test
	public void longestCommonPrefixWhenSecondStringIsShorterThanFirstStringShouldWork() {
		Solution solution = new Solution();
		assertThat(solution.longestCommonPrefix(new String[] { "aa", "a" })).isEqualTo("a");
	}

}
