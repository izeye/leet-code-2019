package com.izeye.play.leetcode.problem18;

import java.util.Arrays;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void fourSum() {
		Solution solution = new Solution();
		assertThat(solution.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0))
				.containsExactlyInAnyOrder(
						Arrays.asList(-1,  0, 0, 1),
						Arrays.asList(-2, -1, 1, 2),
						Arrays.asList(-2,  0, 0, 2));
	}

}
