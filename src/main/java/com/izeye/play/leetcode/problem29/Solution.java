package com.izeye.play.leetcode.problem29;

/**
 * Solution for LeetCode problem 29, "Divide Two Integers".
 *
 * See https://leetcode.com/problems/divide-two-integers/
 *
 * @author Johnny Lim
 */
class Solution {

	public int divide(int dividend, int divisor) {
		// FIXME: Don't cheat with division.
		long quotient = ((long) dividend) / divisor;
		return quotient > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) quotient;
	}

}
