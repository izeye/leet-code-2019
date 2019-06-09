package com.izeye.play.leetcode.problem11;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void maxArea() {
		Solution solution = new Solution();
		assertThat(solution.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 })).isEqualTo(49);
	}

}
