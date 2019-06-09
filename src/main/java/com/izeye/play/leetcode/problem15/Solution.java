package com.izeye.play.leetcode.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution for LeetCode problem 15, "3Sum".
 *
 * See https://leetcode.com/problems/3sum/
 *
 * @author Johnny Lim
 */
class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int firstNonNegativeIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				firstNonNegativeIndex = i;
				break;
			}
		}
		Set<List<Integer>> sums = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int first = nums[i];
			if (first > 0) {
				break;
			}
			for (int j = i + 1; j < nums.length - 1; j++) {
				int second = nums[j];
				int twoSum = first + second;
				if (twoSum > 0) {
					break;
				}
				for (int k = Math.max(j + 1, firstNonNegativeIndex); k < nums.length; k++) {
					int third = nums[k];
					int threeSum = twoSum + third;
					if (threeSum > 0) {
						break;
					}
					if (threeSum == 0) {
						sums.add(Arrays.asList(first, second, third));
						break;
					}
				}
			}
		}
		return new ArrayList<>(sums);
	}

}
