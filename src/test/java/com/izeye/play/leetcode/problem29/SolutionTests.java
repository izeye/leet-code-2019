package com.izeye.play.leetcode.problem29;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void divide() {
		Solution solution = new Solution();
		assertThat(solution.divide(10, 3)).isEqualTo(3);
		assertThat(solution.divide(7, -3)).isEqualTo(-2);
	}

	@Test
	public void divideWhenDividendIsSameAsDivisor() {
		Solution solution = new Solution();
		assertThat(solution.divide(1, 1)).isEqualTo(1);
	}

	@Test
	public void divideWhenDividendIsNegative() {
		Solution solution = new Solution();
		assertThat(solution.divide(-1, 1)).isEqualTo(-1);
	}

	@Test
	public void divideWhenBothDividendAndDivisorAreNegative() {
		Solution solution = new Solution();
		assertThat(solution.divide(-1, -1)).isEqualTo(1);
	}

	@Test
	public void divideWhenQuotientOverflows() {
		Solution solution = new Solution();

		long startTimeMillis = System.currentTimeMillis();

		assertThat(solution.divide(-2147483648, -1)).isEqualTo(2147483647);

		long elapsedTimeMillis = System.currentTimeMillis() - startTimeMillis;
		System.out.println("Elapsed time (ms): " + elapsedTimeMillis);
	}

	@Test
	public void divideWhenQuotientIsLarge() {
		Solution solution = new Solution();

		long startTimeMillis = System.currentTimeMillis();

		assertThat(solution.divide(2147483647, 1)).isEqualTo(2147483647);

		long elapsedTimeMillis = System.currentTimeMillis() - startTimeMillis;
		System.out.println("Elapsed time (ms): " + elapsedTimeMillis);
	}

}
