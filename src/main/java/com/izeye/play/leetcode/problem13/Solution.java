package com.izeye.play.leetcode.problem13;

/**
 * Solution for LeetCode problem 13, "Roman to Integer".
 *
 * See https://leetcode.com/problems/roman-to-integer/
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

	public int romanToInt(String s) {
		int integer = 0;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			char lookahead = 0;
			if (i + 1 < s.length()) {
				lookahead = s.charAt(i + 1);
			}
			switch (current) {
				case ROMAN_1000:
					integer += 1000;
					break;

				case ROMAN_500:
					integer += 500;
					break;

				case ROMAN_100:
					if (lookahead == ROMAN_1000 || lookahead == ROMAN_500) {
						integer -= 100;
					}
					else {
						integer += 100;
					}
					break;

				case ROMAN_50:
					integer += 50;
					break;

				case ROMAN_10:
					if (lookahead == ROMAN_100 || lookahead == ROMAN_50) {
						integer -= 10;
					}
					else {
						integer += 10;
					}
					break;

				case ROMAN_5:
					integer += 5;
					break;

				case ROMAN_1:
					if (lookahead == ROMAN_10 || lookahead == ROMAN_5) {
						integer -= 1;
					}
					else {
						integer += 1;
					}
					break;

				default:
					throw new IllegalArgumentException("Unexpected roman numeral: " + current);
			}
		}
		return integer;
	}

}
