package com.izeye.play.leetcode.problem26;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void removeDuplicates() {
		Solution solution = new Solution();

		int[] nums1 = { 1, 1, 2 };
		assertThat(solution.removeDuplicates(nums1)).isEqualTo(2);
		assertThat(nums1[0]).isEqualTo(1);
		assertThat(nums1[1]).isEqualTo(2);

		int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		assertThat(solution.removeDuplicates(nums2)).isEqualTo(5);
		assertThat(nums2[0]).isEqualTo(0);
		assertThat(nums2[1]).isEqualTo(1);
		assertThat(nums2[2]).isEqualTo(2);
		assertThat(nums2[3]).isEqualTo(3);
		assertThat(nums2[4]).isEqualTo(4);
	}

	@Test
	public void removeDuplicatesWhenNumberArrayIsEmpty() {
		Solution solution = new Solution();
		assertThat(solution.removeDuplicates(new int[] {})).isEqualTo(0);
	}

}
