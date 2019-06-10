package com.izeye.play.leetcode.problem22;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void generateParenthesis() {
		Solution solution = new Solution();
		assertThat(solution.generateParenthesis(3))
				.containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
	}

}
