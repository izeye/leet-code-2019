package com.izeye.play.leetcode.problem24;

/**
 * Solution for LeetCode problem 24, "Swap Nodes in Pairs".
 *
 * See https://leetcode.com/problems/swap-nodes-in-pairs/
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

	public ListNode swapPairs(ListNode head) {
		ListNode newHead = head;
		ListNode current = head;
		ListNode previous = null;
		while (true) {
			ListNode swapped = swap(current);
			if (swapped == current) {
				break;
			}
			if (newHead == head) {
				newHead = swapped;
			}
			if (previous != null) {
				previous.next = swapped;
			}
			previous = current;
			current = swapped.next.next;
		}
		return newHead;
	}

	private ListNode swap(ListNode first) {
		if (first == null || first.next == null) {
			return first;
		}
		ListNode newFirst = first.next;
		first.next = newFirst.next;
		newFirst.next = first;
		return newFirst;
	}

}
