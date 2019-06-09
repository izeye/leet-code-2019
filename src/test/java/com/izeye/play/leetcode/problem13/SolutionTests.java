package com.izeye.play.leetcode.problem13;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void romanToInt() {
		Solution solution = new Solution();
		assertThat(solution.romanToInt("III")).isEqualTo(3);
		assertThat(solution.romanToInt("IV")).isEqualTo(4);
		assertThat(solution.romanToInt("IX")).isEqualTo(9);
		assertThat(solution.romanToInt("LVIII")).isEqualTo(58);
		assertThat(solution.romanToInt("MCMXCIV")).isEqualTo(1994);
	}

}
