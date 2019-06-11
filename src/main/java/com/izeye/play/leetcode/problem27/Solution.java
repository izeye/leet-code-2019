package com.izeye.play.leetcode.problem27;

/**
 * Solution for LeetCode problem 27, "Remove Element".
 *
 * See https://leetcode.com/problems/remove-element/
 *
 * @author Johnny Lim
 */
class Solution {

	public int removeElement(int[] nums, int val) {
		int outputIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value != val) {
				nums[outputIndex] = value;
				outputIndex++;
			}
		}
		return outputIndex;
	}

}
