package com.izeye.play.leetcode.problem23;

/**
 * Solution for LeetCode problem 23, "Merge k Sorted Lists".
 *
 * See https://leetcode.com/problems/merge-k-sorted-lists/
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

	public ListNode mergeKLists(ListNode[] lists) {
		ListNode head = null;
		ListNode current;
		ListNode previous = null;
		while (true) {
			int min = Integer.MAX_VALUE;
			Integer minIndex = null;
			for (int i = 0; i < lists.length; i++) {
				ListNode list = lists[i];
				if (list == null) {
					continue;
				}
				if (list.val < min) {
					min = list.val;
					minIndex = i;
				}
			}
			if (minIndex == null) {
				break;
			}
			current = lists[minIndex];
			lists[minIndex] = current.next;
			if (previous == null) {
				head = current;
			}
			else {
				previous.next = current;
			}
			previous = current;
		}
		return head;
	}

}
