package com.izeye.play.leetcode.problem22;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for LeetCode problem 22, "Generate Parentheses".
 *
 * See https://leetcode.com/problems/generate-parentheses/
 *
 * @author Johnny Lim
 */
class Solution {

	public List<String> generateParenthesis(int n) {
		List<String> solutions = new ArrayList<>();
		appendParenthesis(solutions, new StringBuilder().append('('), n - 1, 1);
		return solutions;
	}

	private static void appendParenthesis(List<String> solutions, StringBuilder sb, int n, int left) {
		if (n == 0 && left == 0) {
			solutions.add(sb.toString());
			return;
		}
		if (left > 0) {
			appendParenthesis(solutions, new StringBuilder(sb).append(')'), n, left - 1);
		}
		if (n > 0) {
			appendParenthesis(solutions, new StringBuilder(sb).append('('), n - 1, left + 1);
		}
	}

}
