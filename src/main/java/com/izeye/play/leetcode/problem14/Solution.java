package com.izeye.play.leetcode.problem14;

/**
 * Solution for LeetCode problem 14, "Longest Common Prefix".
 *
 * See https://leetcode.com/problems/longest-common-prefix/
 *
 * @author Johnny Lim
 */
class Solution {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String first = strs[0];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				String string = strs[j];
				if (i == string.length() || string.charAt(i) != c) {
					return sb.toString();
				}
			}
			sb.append(c);
		}
		return sb.toString();
	}

}
