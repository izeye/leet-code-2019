package com.izeye.play.leetcode.problem9;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void isPalindrome() {
		Solution solution = new Solution();
		assertThat(solution.isPalindrome(121)).isTrue();
		assertThat(solution.isPalindrome(-121)).isFalse();
		assertThat(solution.isPalindrome(10)).isFalse();
	}

}
