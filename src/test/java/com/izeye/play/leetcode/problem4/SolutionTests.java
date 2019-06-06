package com.izeye.play.leetcode.problem4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void findMedianSortedArraysWhenMergeArraySizeIsOdd() {
		int[] num1 = { 1, 3 };
		int[] num2 = { 2 };
		Solution solution = new Solution();
		assertThat(solution.findMedianSortedArrays(num1, num2)).isEqualTo(2d);
	}

	@Test
	public void findMedianSortedArraysWhenMergeArraySizeIsEven() {
		int[] num1 = { 1, 2 };
		int[] num2 = { 3, 4 };
		Solution solution = new Solution();
		assertThat(solution.findMedianSortedArrays(num1, num2)).isEqualTo(2.5d);
	}

}
