package com.izeye.play.leetcode.problem5;

/**
 * Solution for LeetCode problem 5, "Longest Palindromic Substring".
 *
 * See https://leetcode.com/problems/longest-palindromic-substring/
 *
 * @author Johnny Lim
 */
class Solution {

	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return s;
		}
		char[] chars = s.toCharArray();
		int longestPalindromeLength = 1;
		int longestPalindromeStartIndex = 0;
		for (int i = 0; i < chars.length; i++) {
			if (longestPalindromeLength > chars.length - i) {
				break;
			}
			for (int j = chars.length - 1; j > i; j--) {
				if (isPalindrome(chars, i, j)) {
					int length = j - i + 1;
					if (length > longestPalindromeLength) {
						longestPalindromeLength = length;
						longestPalindromeStartIndex = i;
					}
				}
			}
		}
		return new String(chars, longestPalindromeStartIndex, longestPalindromeLength);
	}

	static boolean isPalindrome(char[] chars, int start, int end) {
		while (start < end) {
			if (chars[start] != chars[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
