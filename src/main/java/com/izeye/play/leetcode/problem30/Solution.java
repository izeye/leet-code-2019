package com.izeye.play.leetcode.problem30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution for LeetCode problem 30, "Substring with Concatenation of All Words".
 *
 * See https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 *
 * @author Johnny Lim
 */
class Solution {

	public List<Integer> findSubstring(String s, String[] words) {
		if (words.length == 0) {
			return Collections.emptyList();
		}
		int totalWordsLength = 0;
		for (String word : words) {
			totalWordsLength += word.length();
		}
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int current = i;
			List<String> wordList = Arrays.stream(words).collect(Collectors.toList());
			if (s.length() - current < totalWordsLength) {
				break;
			}
			String word;
			while ((word = getMatchedWord(s, current, wordList)) != null) {
				wordList.remove(word);
				current += word.length();
			}
			if (wordList.isEmpty()) {
				indexes.add(i);
			}
		}
		return indexes;
	}

	private static String getMatchedWord(String s, int current, List<String> words) {
		for (String word : words) {
			boolean match = true;
			if (current + word.length() > s.length()) {
				continue;
			}
			for (int j = 0; j < word.length(); j++) {
				if (s.charAt(current + j) != word.charAt(j)) {
					match = false;
					break;
				}
			}
			if (match) {
				return word;
			}
		}
		return null;
	}

}
