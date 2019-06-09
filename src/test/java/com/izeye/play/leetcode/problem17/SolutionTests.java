package com.izeye.play.leetcode.problem17;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void letterCombinations() {
		Solution solution = new Solution();
		assertThat(solution.letterCombinations("23"))
				.containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
	}

	@Test
	public void letterCombinationsWhenDigitsIsEmptyShouldReturnEmpty() {
		Solution solution = new Solution();
		assertThat(solution.letterCombinations("")).isEmpty();
	}

	@Test
	public void letterCombinationsWhenDigitsIs7ShouldReturnFourCombinations() {
		Solution solution = new Solution();
		assertThat(solution.letterCombinations("7")).containsExactlyInAnyOrder("p", "q", "r", "s");
	}

}
