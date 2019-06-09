package com.izeye.play.leetcode.problem19;

/**
 * Solution for LeetCode problem 19, "Remove Nth Node From End of List".
 *
 * See https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return null;
		}

		ListNode current = head;
		int size = 0;
		do {
			size++;
			current = current.next;
		}
		while (current != null);

		if (n == size) {
			return head.next;
		}

		current = head;
		ListNode previous = null;
		for (int i = 0; i < size - n; i++) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
		return head;
	}

}
