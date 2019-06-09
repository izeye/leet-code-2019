package com.izeye.play.leetcode.problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution for LeetCode problem 18, "4Sum".
 *
 * See https://leetcode.com/problems/4sum/
 *
 * @author Johnny Lim
 */
class Solution {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> quadruplets = new HashSet<>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						int first = nums[i];
						int second = nums[j];
						int third = nums[k];
						int fourth = nums[l];
						int sum = first + second + third + fourth;
						if (sum == target) {
							quadruplets.add(Arrays.asList(first, second, third, fourth));
						}
					}
				}
			}
		}
		return new ArrayList<>(quadruplets);
	}

}
