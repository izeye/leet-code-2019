package com.izeye.play.leetcode.problem28;

/**
 * Solution for LeetCode problem 28, "Implement strStr()".
 *
 * See https://leetcode.com/problems/implement-strstr/
 *
 * @author Johnny Lim
 */
class Solution {

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j;
			for (j = 0; j < needle.length(); j++) {
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					break;
				}
			}
			if (j == needle.length()) {
				return i;
			}
		}
		return -1;
	}

}
