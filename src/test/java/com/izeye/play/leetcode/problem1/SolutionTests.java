package com.izeye.play.leetcode.problem1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void test() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		Solution solution = new Solution();
		assertThat(solution.twoSum(nums, target)).containsExactly(0, 1);
	}

}
