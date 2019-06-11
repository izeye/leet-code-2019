package com.izeye.play.leetcode.problem28;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void strStr() {
		Solution solution = new Solution();
		assertThat(solution.strStr("hello", "ll")).isEqualTo(2);
		assertThat(solution.strStr("aaaaa", "bba")).isEqualTo(-1);
	}

	@Test
	public void strStrWhenBothHaystackAndNeedleAreEmptyShouldReturnZero() {
		Solution solution = new Solution();
		assertThat(solution.strStr("", "")).isEqualTo(0);
	}

	@Test
	public void strStrWhenBothHaystackAndNeedleAreOneCharacterAndSame() {
		Solution solution = new Solution();
		assertThat(solution.strStr("a", "a")).isEqualTo(0);
	}

}
