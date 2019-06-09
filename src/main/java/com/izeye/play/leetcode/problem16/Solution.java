package com.izeye.play.leetcode.problem16;

import java.util.Arrays;

/**
 * Solution for LeetCode problem 16, "3Sum Closest".
 *
 * See https://leetcode.com/problems/3sum-closest/
 *
 * @author Johnny Lim
 */
class Solution {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closest = Integer.MAX_VALUE;
		Integer closestSum = null;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == target) {
						return target;
					}
					int distance = Math.abs(sum - target);
					if (distance < closest) {
						closestSum = sum;
						closest = distance;
					}
				}
			}
		}
		return closestSum;
	}

}
