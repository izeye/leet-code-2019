package com.izeye.play.leetcode.problem2;

/**
 * Solution for LeetCode problem 2, "Add Two Numbers".
 *
 * See https://leetcode.com/problems/add-two-numbers/
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int number1 = l1.val;
		int number2 = l2.val;
		int sum = number1 + number2;
		int carry = sum > 9 ? 1 : 0;
		int remainder = sum % 10;
		ListNode head = new ListNode(remainder);
		ListNode current = head;
		while (l1.next != null || l2.next != null) {
			if (l1.next != null) {
				number1 = l1.next.val;
				l1 = l1.next;
			}
			else {
				number1 = 0;
			}

			if (l2.next != null) {
				number2 = l2.next.val;
				l2 = l2.next;
			}
			else {
				number2 = 0;
			}

			sum = number1 + number2 + carry;
			carry = sum > 9 ? 1 : 0;
			remainder = sum % 10;

			current.next = new ListNode(remainder);
			current = current.next;
		}
		if (carry != 0) {
			current.next = new ListNode(carry);
		}
		return head;
	}

}
