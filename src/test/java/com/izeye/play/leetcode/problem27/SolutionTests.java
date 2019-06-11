package com.izeye.play.leetcode.problem27;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void removeElement() {
		Solution solution = new Solution();

		int[] nums1 = { 3, 2, 2, 3 };
		assertThat(solution.removeElement(nums1, 3)).isEqualTo(2);
		assertThat(nums1[0]).isEqualTo(2);
		assertThat(nums1[1]).isEqualTo(2);

		int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		assertThat(solution.removeElement(nums2, 2)).isEqualTo(5);
		assertThat(nums2[0]).isEqualTo(0);
		assertThat(nums2[1]).isEqualTo(1);
		assertThat(nums2[2]).isEqualTo(3);
		assertThat(nums2[3]).isEqualTo(0);
		assertThat(nums2[4]).isEqualTo(4);
	}
	
}
