package com.izeye.play.leetcode.problem7;

/**
 * Solution for LeetCode problem 7, "Reverse Integer".
 *
 * See https://leetcode.com/problems/reverse-integer/
 *
 * @author Johnny Lim
 */
class Solution {

	public int reverse(int x) {
		String digits = String.valueOf(x);
		char[] chars = digits.toCharArray();
		try {
			return Integer.parseInt(reverse(chars));
		}
		catch (NumberFormatException ex) {
			return 0;
		}
	}

	private static String reverse(char[] chars) {
		StringBuilder sb = new StringBuilder();
		int start = 0;
		if (chars[0] == '-') {
			sb.append('-');
			start = 1;
		}
		for (int i = chars.length - 1; i >= start; i--) {
			char c = chars[i];
			if (c == 0) {
				continue;
			}
			sb.append(c);
		}
		return sb.toString();
	}

}
