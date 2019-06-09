package com.izeye.play.leetcode.problem12;

/**
 * Solution for LeetCode problem 12, "Integer to Roman".
 *
 * See https://leetcode.com/problems/integer-to-roman/
 *
 * @author Johnny Lim
 */
class Solution {

	private static final char ROMAN_1 = 'I';
	private static final char ROMAN_5 = 'V';
	private static final char ROMAN_10 = 'X';
	private static final char ROMAN_50 = 'L';
	private static final char ROMAN_100 = 'C';
	private static final char ROMAN_500 = 'D';
	private static final char ROMAN_1000 = 'M';

	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int thousands = num / 1000;
		for (int i = 0; i < thousands; i++) {
			sb.append(ROMAN_1000);
		}
		num %= 1000;
		int hundreds = num / 100;
		digitToRoman(sb, hundreds, ROMAN_100, ROMAN_500, ROMAN_1000);
		num %= 100;
		int tens = num / 10;
		digitToRoman(sb, tens, ROMAN_10, ROMAN_50, ROMAN_100);
		int ones = num % 10;
		digitToRoman(sb, ones, ROMAN_1, ROMAN_5, ROMAN_10);
		return sb.toString();
	}

	private void digitToRoman(StringBuilder sb, int digit, char digit1, char digit5, char digit10) {
		if (digit < 4) {
			for (int i = 0; i < digit; i++) {
				sb.append(digit1);
			}
		}
		else if (digit == 4) {
			sb.append(digit1).append(digit5);
		}
		else if (digit == 9) {
			sb.append(digit1).append(digit10);
		}
		else {
			sb.append(digit5);
			for (int i = 0; i < digit - 5; i++) {
				sb.append(digit1);
			}
		}
	}

}
