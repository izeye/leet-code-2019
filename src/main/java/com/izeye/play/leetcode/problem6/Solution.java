package com.izeye.play.leetcode.problem6;

/**
 * Solution for LeetCode problem 6, "ZigZag Conversion".
 *
 * See https://leetcode.com/problems/zigzag-conversion/
 *
 * @author Johnny Lim
 */
class Solution {

	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		int charactersInPattern = numRows + (numRows - 2);
		int numColumnsInPattern = 1 + (numRows - 2);
		int length = s.length();
		int numPatterns = length / charactersInPattern;
		int remainder = length % charactersInPattern;
		int numColumns = numPatterns * numColumnsInPattern;
		if (remainder > 0) {
			numColumns++;
			if (remainder > 4) {
				numColumns += remainder - 4;
			}
		}
		char[][] matrix = new char[numRows][numColumns];
		int row = 0;
		int column = 0;
		boolean down = true;
		for (int i = 0; i < length; i++) {
			if (down) {
				matrix[row][column] = s.charAt(i);
				if (row == numRows - 1) {
					down = false;
				}
				else {
					row++;
				}
			}
			else {
				row--;
				column++;

				matrix[row][column] = s.charAt(i);
				if (row == 0) {
					down = true;
					row++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numColumns; c++) {
				char value = matrix[r][c];
				if (value != 0) {
					sb.append(value);
				}
			}
		}
		return sb.toString();
	}

}
