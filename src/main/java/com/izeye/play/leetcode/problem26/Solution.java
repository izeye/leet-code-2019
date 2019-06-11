package com.izeye.play.leetcode.problem26;

/**
 * Solution for LeetCode problem 26, "Remove Duplicates from Sorted Array".
 *
 * See https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author Johnny Lim
 */
class Solution {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int outputIndex = 1;
		Integer previous = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int value = nums[i];
			if (value != previous) {
				nums[outputIndex] = value;
				outputIndex++;
				previous = value;
			}
		}
		return outputIndex;
	}

}
