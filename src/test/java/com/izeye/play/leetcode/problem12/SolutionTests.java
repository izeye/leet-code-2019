package com.izeye.play.leetcode.problem12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void intToRoman() {
		Solution solution = new Solution();
		assertThat(solution.intToRoman(3)).isEqualTo("III");
		assertThat(solution.intToRoman(4)).isEqualTo("IV");
		assertThat(solution.intToRoman(9)).isEqualTo("IX");
		assertThat(solution.intToRoman(58)).isEqualTo("LVIII");
		assertThat(solution.intToRoman(1994)).isEqualTo("MCMXCIV");
	}

}
