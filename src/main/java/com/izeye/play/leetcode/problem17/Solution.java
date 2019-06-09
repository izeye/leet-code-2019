package com.izeye.play.leetcode.problem17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for LeetCode problem 17, "Letter Combinations of a Phone Number".
 *
 * See https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author Johnny Lim
 */
class Solution {

	private static final Map<Character, List<Character>> LETTERS_BY_DIGIT;

	static {
		Map<Character, List<Character>> lettersByDigit = new HashMap<>();
		lettersByDigit.put('2', Arrays.asList('a', 'b', 'c'));
		lettersByDigit.put('3', Arrays.asList('d', 'e', 'f'));
		lettersByDigit.put('4', Arrays.asList('g', 'h', 'i'));
		lettersByDigit.put('5', Arrays.asList('j', 'k', 'l'));
		lettersByDigit.put('6', Arrays.asList('m', 'n', 'o'));
		lettersByDigit.put('7', Arrays.asList('p', 'q', 'r', 's'));
		lettersByDigit.put('8', Arrays.asList('t', 'u', 'v'));
		lettersByDigit.put('9', Arrays.asList('w', 'x', 'y', 'z'));
		LETTERS_BY_DIGIT = Collections.unmodifiableMap(lettersByDigit);
	}

	public List<String> letterCombinations(String digits) {
		if (digits.isEmpty()) {
			return Collections.emptyList();
		}
		List<String> combinations = new ArrayList<>();
		appendLetter(combinations, new StringBuilder(), digits, 0);
		return combinations;
	}

	private static void appendLetter(List<String> combinations, StringBuilder sb, String digits, int index) {
		char digit = digits.charAt(index);
		List<Character> letters = LETTERS_BY_DIGIT.get(digit);
		for (Character letter : letters) {
			StringBuilder appended = new StringBuilder(sb).append(letter);
			if (index == digits.length() - 1) {
				combinations.add(appended.toString());
			}
			else {
				appendLetter(combinations, appended, digits, index + 1);
			}
		}
	}

}
