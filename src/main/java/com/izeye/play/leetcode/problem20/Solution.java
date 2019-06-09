package com.izeye.play.leetcode.problem20;

import java.util.Stack;

/**
 * Solution for LeetCode problem 20, "Valid Parentheses".
 *
 * See https://leetcode.com/problems/valid-parentheses/
 *
 * @author Johnny Lim
 */
class Solution {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case '(':
				case '{':
				case '[':
					stack.push(c);
					break;

				case ')':
					if (!checkParenthesis(stack, '(')) {
						return false;
					}
					break;

				case '}':
					if (!checkParenthesis(stack, '{')) {
						return false;
					}
					break;

				case ']':
					if (!checkParenthesis(stack, '[')) {
						return false;
					}
					break;

				default:
					break;
			}
		}
		return stack.isEmpty();
	}

	private boolean checkParenthesis(Stack<Character> stack, char expected) {
		return !stack.isEmpty() && stack.pop() == expected;
	}

}
