package com.izeye.play.leetcode.problem16;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void threeSumClosest() {
		Solution solution = new Solution();
		assertThat(solution.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1)).isEqualTo(2);
	}

}
