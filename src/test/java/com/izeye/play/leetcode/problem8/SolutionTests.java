package com.izeye.play.leetcode.problem8;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void myAtoi() {
		Solution solution = new Solution();
		assertThat(solution.myAtoi("42")).isEqualTo(42);
		assertThat(solution.myAtoi("   -42")).isEqualTo(-42);
		assertThat(solution.myAtoi("4193 with words")).isEqualTo(4193);
		assertThat(solution.myAtoi("words and 987")).isEqualTo(0);
		assertThat(solution.myAtoi("-91283472332")).isEqualTo(-2147483648);
	}

	@Test
	public void myAtoiWhenStringIsSingleDigit() {
		Solution solution = new Solution();
		assertThat(solution.myAtoi("1")).isEqualTo(1);
		assertThat(solution.myAtoi("+1")).isEqualTo(1);
		assertThat(solution.myAtoi("-1")).isEqualTo(-1);
	}

}
