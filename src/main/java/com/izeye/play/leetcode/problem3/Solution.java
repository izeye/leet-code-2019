package com.izeye.play.leetcode.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for LeetCode problem 3, "Longest Substring Without Repeating Characters".
 *
 * See https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Johnny Lim
 */
class Solution {

	public int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		if (chars.length == 0) {
			return 0;
		}
		int longestLength = 1;
		for (int i = 0; i < chars.length - 1; i++) {
			if (longestLength > chars.length - i) {
				break;
			}
			Set<Character> seen = new HashSet<>();
			seen.add(chars[i]);
			boolean foundDuplicate = false;
			for (int j = i + 1; j < chars.length; j++) {
				char c = chars[j];
				if (seen.contains(c)) {
					int length = j - i;
					if (length > longestLength) {
						longestLength = length;
					}
					foundDuplicate = true;
					break;
				}
				seen.add(c);
			}
			if (!foundDuplicate) {
				int length = chars.length - i;
				if (length > longestLength) {
					longestLength = length;
					break;
				}
			}
		}
		return longestLength;
	}

}
