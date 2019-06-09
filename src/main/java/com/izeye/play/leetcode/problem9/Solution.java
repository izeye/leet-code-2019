package com.izeye.play.leetcode.problem9;

/**
 * Solution for LeetCode problem 9, "Palindrome Number".
 *
 * See https://leetcode.com/problems/palindrome-number/
 *
 * @author Johnny Lim
 */
class Solution {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		return isPalindrome(String.valueOf(x));
	}

	private static boolean isPalindrome(String string) {
		int length = string.length();
		for (int i = 0; i < length; i++) {
			int backwardIndex = length - 1 - i;
			if (i >= backwardIndex) {
				return true;
			}
			if (string.charAt(i) != string.charAt(backwardIndex)) {
				return false;
			}
		}
		return true;
	}

}
