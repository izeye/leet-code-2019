package com.izeye.play.leetcode.problem29;

/**
 * Solution for LeetCode problem 29, "Divide Two Integers".
 *
 * See https://leetcode.com/problems/divide-two-integers/
 *
 * This has been cheated with the following: https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
 *
 * @author Johnny Lim
 */
class Solution {

	public int divide(int dividend, int divisor) {
		long dividendAsLong = dividend;
		long divisorAsLong = divisor;
		boolean negativeDividend = false;
		if (dividendAsLong < 0) {
			dividendAsLong = -dividendAsLong;
			negativeDividend = true;
		}
		boolean negativeDivisor = false;
		if (divisorAsLong < 0) {
			divisorAsLong = -divisorAsLong;
			negativeDivisor = true;
		}
		boolean negative = negativeDividend ^ negativeDivisor;
		long quotient = 0;
		long temp = 0;
		for (int i = 31; i >= 0; i--) {
			long shifted = divisorAsLong << i;
			if (temp + shifted <= dividendAsLong) {
				temp += shifted;
				quotient |= 1L << i;
			}
		}
		long result = negative ? -quotient : quotient;
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) result;
	}

}
