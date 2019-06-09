package com.izeye.play.leetcode.problem7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void reverse() {
		Solution solution = new Solution();
		assertThat(solution.reverse(123)).isEqualTo(321);
		assertThat(solution.reverse(-123)).isEqualTo(-321);
		assertThat(solution.reverse(120)).isEqualTo(21);
	}

	@Test
	public void reverseWhenIntegerIsSingleDigit() {
		Solution solution = new Solution();
		assertThat(solution.reverse(1)).isEqualTo(1);
		assertThat(solution.reverse(-1)).isEqualTo(-1);
	}

	@Test
	public void reverseWhenIntegerOverflowsShouldReturnZero() {
		Solution solution = new Solution();
		assertThat(solution.reverse(1534236469)).isEqualTo(0);

	}

}
