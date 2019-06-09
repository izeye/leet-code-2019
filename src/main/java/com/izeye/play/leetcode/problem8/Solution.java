package com.izeye.play.leetcode.problem8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Solution for LeetCode problem 8, "String to Integer (atoi)".
 *
 * See https://leetcode.com/problems/string-to-integer-atoi/
 *
 * @author Johnny Lim
 */
class Solution {

	private static final Pattern PATTERN = Pattern.compile("^ *((:?\\+|-)?\\d+)\\D?");

	public int myAtoi(String str) {
		Matcher matcher = PATTERN.matcher(str);
		if (!matcher.find()) {
			return 0;
		}
		String integer = matcher.group(1);
		try {
			return Integer.parseInt(integer);
		}
		catch (NumberFormatException ex) {
			if (integer.charAt(0) == '-') {
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
	}

}
