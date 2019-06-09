package com.izeye.play.leetcode.problem11;

/**
 * Solution for LeetCode problem 11, "Container With Most Water".
 *
 * See https://leetcode.com/problems/container-with-most-water/
 *
 * @author Johnny Lim
 */
class Solution {

	public int maxArea(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i; j < height.length; j++) {
				int area = (j - i) * Math.min(height[i], height[j]);
				if (area > max) {
					max = area;
				}
			}
		}
		return max;
	}

}
