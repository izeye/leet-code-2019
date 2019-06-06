package com.izeye.play.leetcode.problem3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void lengthOfLongestSubstring() {
		Solution solution = new Solution();
		assertThat(solution.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
		assertThat(solution.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
		assertThat(solution.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
	}

	@Test
	public void lengthOfLongestSubstringWithFailedTestCases() {
		Solution solution = new Solution();
		assertThat(solution.lengthOfLongestSubstring(" ")).isEqualTo(1);
		assertThat(solution.lengthOfLongestSubstring("au")).isEqualTo(2);
		assertThat(solution.lengthOfLongestSubstring("asljlj")).isEqualTo(4);
		assertThat(solution.lengthOfLongestSubstring("anviaj")).isEqualTo(5);
	}

}
