package com.izeye.play.leetcode.problem1;

/**
 * Solution for LeetCode problem 1, "Two Sum".
 *
 * See https://leetcode.com/problems/two-sum/
 *
 * @author Johnny Lim
 */
class Solution {

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("There must be a solution.");
	}

}
