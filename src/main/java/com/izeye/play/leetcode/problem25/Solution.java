package com.izeye.play.leetcode.problem25;

/**
 * Solution for LeetCode problem 25, "Reverse Nodes in k-Group".
 *
 * See https://leetcode.com/problems/reverse-nodes-in-k-group/
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * @author Johnny Lim
 */
class Solution {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode newHead = head;
		ListNode current = head;
		ListNode previous = null;
		while (true) {
			ListNode reversed = reverse(current, k);
			if (reversed == current) {
				break;
			}
			if (newHead == head) {
				newHead = reversed;
			}
			if (previous != null) {
				previous.next = reversed;
			}
			previous = current;
			current = reversed;
			for (int i = 0; i < k; i++) {
				current = current.next;
			}
		}
		return newHead;
	}

	private ListNode reverse(ListNode first, int groupSize) {
		ListNode current = first;
		int size = groupSize;
		while (current != null) {
			size--;
			if (size == 0) {
				break;
			}
			current = current.next;
		}
		if (size > 0) {
			return first;
		}
		ListNode newFirst = current;
		current = first.next;
		ListNode next;
		ListNode previous = first;
		ListNode previous2 = null;
		for (int i = 0; i < groupSize - 1; i++) {
			next = current.next;
			current.next = previous;
			previous.next = previous2;
			previous2 = previous;
			previous = current;
			current = next;
		}
		first.next = current;
		return newFirst;
	}

}
