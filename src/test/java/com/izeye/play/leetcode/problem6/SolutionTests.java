package com.izeye.play.leetcode.problem6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void convert() {
		Solution solution = new Solution();
		assertThat(solution.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
		assertThat(solution.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
	}

	@Test
	public void convertWhenStringIsEmptyShouldReturnEmpty() {
		Solution solution = new Solution();
		assertThat(solution.convert("", 1)).isEqualTo("");
	}

	@Test
	public void convertWhenStringIsSingleCharacterShouldReturnSingleCharacter() {
		Solution solution = new Solution();
		assertThat(solution.convert("A", 1)).isEqualTo("A");
	}

}
