package com.izeye.play.leetcode.problem4;

/**
 * Solution for LeetCode problem 4, "Median of Two Sorted Arrays".
 *
 * See https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * @author Johnny Lim
 */
class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = nums1.length + nums2.length;
		int medianIndex = length / 2;
		boolean even = length % 2 == 0;
		int index1 = 0;
		int index2 = 0;
		int median1 = Integer.MIN_VALUE;
		int median2 = Integer.MIN_VALUE;
		for (int i = 0; i <= medianIndex; i++) {
			median1 = median2;
			if (index1 == nums1.length) {
				median2 = nums2[index2];
				index2++;
			}
			else if (index2 == nums2.length) {
				median2 = nums1[index1];
				index1++;
			}
			else if (nums1[index1] < nums2[index2]) {
				median2 = nums1[index1];
				index1++;
			}
			else {
				median2 = nums2[index2];
				index2++;
			}
		}
		return even ? (median1 + median2) / 2d : median2;
	}

}
