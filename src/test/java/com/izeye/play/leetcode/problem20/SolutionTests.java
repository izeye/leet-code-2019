package com.izeye.play.leetcode.problem20;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void isValid() {
		Solution solution = new Solution();
		assertThat(solution.isValid("")).isTrue();
		assertThat(solution.isValid("()")).isTrue();
		assertThat(solution.isValid("()[]{}")).isTrue();
		assertThat(solution.isValid("(]")).isFalse();
		assertThat(solution.isValid("([)]")).isFalse();
		assertThat(solution.isValid("{[]}")).isTrue();
	}

	@Test
	public void isValidWhenInputHasNoOpeningParenthesis() {
		Solution solution = new Solution();
		assertThat(solution.isValid("]")).isFalse();
	}

}
