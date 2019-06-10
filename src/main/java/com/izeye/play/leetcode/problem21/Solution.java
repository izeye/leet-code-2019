package com.izeye.play.leetcode.problem21;

/**
 * Solution for LeetCode problem 21, "Merge Two Sorted Lists".
 *
 * See https://leetcode.com/problems/merge-two-sorted-lists/
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

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = null;
		ListNode current;
		ListNode previous = null;
		while (true) {
			if (l1 != null && l2 != null) {
				int value1 = l1.val;
				int value2 = l2.val;
				if (value1 < value2) {
					current = l1;
					l1 = l1.next;
				}
				else {
					current = l2;
					l2 = l2.next;
				}
				if (previous == null) {
					head = current;
				}
				else {
					previous.next = current;
				}
				previous = current;
			}
			else if (l1 == null) {
				previous.next = l2;
				break;
			}
			else if (l2 == null) {
				previous.next = l1;
				break;
			}
		}
		return head;
	}

}
