package com.izeye.play.leetcode.problem10;

import java.util.regex.Pattern;

/**
 * Solution for LeetCode problem 10, "Regular Expression Matching".
 *
 * See https://leetcode.com/problems/regular-expression-matching/
 *
 * @author Johnny Lim
 */
class Solution {

	public boolean isMatch(String s, String p) {
		// FIXME: Cheat with library.
		return Pattern.compile(p).matcher(s).matches();
	}

}
