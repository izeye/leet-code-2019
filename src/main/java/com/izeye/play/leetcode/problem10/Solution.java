package com.izeye.play.leetcode.problem10;

/**
 * Solution for LeetCode problem 10, "Regular Expression Matching".
 *
 * See https://leetcode.com/problems/regular-expression-matching/
 *
 * @author Johnny Lim
 */
class Solution {

	public boolean isMatch(String s, String p) {
		return isMatch(s, p, 0, 0);
	}

	private static boolean isMatch(String input, String pattern, int inputIndex, int patternIndex) {
		for (; patternIndex < pattern.length(); patternIndex++) {
			char patternChar = pattern.charAt(patternIndex);
			char lookahead = 0;
			if (patternIndex + 1 < pattern.length()) {
				lookahead = pattern.charAt(patternIndex + 1);
			}
			switch (patternChar) {
				case '.':
					if (lookahead == '*') {
						if (isMatch(input, pattern, inputIndex, patternIndex + 2)) {
							return true;
						}
						for (int i = 0; i < input.length() - inputIndex; i++) {
							if (isMatch(input, pattern, inputIndex + i + 1, patternIndex + 2)) {
								return true;
							}
						}
						return false;
					}
					inputIndex++;
					break;

				default:
					if (lookahead == '*') {
						if (isMatch(input, pattern, inputIndex, patternIndex + 2)) {
							return true;
						}
						for (int i = 0; i < input.length() - inputIndex; i++) {
							if (input.charAt(inputIndex + i) != patternChar) {
								break;
							}
							if (isMatch(input, pattern, inputIndex + i + 1, patternIndex + 2)) {
								return true;
							}
						}
						return false;
					}
					else {
						if (inputIndex >= input.length() || input.charAt(inputIndex) != patternChar) {
							return false;
						}
						inputIndex++;
					}
					break;
			}
		}
		return inputIndex == input.length() && patternIndex == pattern.length();
	}

}
