package com.izeye.play.leetcode.problem2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void addTwoNumbers() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		Solution solution = new Solution();
		ListNode output = solution.addTwoNumbers(l1, l2);
		assertThat(output.val).isEqualTo(7);
		assertThat(output.next.val).isEqualTo(0);
		assertThat(output.next.next.val).isEqualTo(8);
		assertThat(output.next.next.next).isNull();
	}

	@Test
	public void addTwoNumbersWhenNumberIsGreaterThanIntegerMaxValue() {
		ListNode l1 = new ListNode(9);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

		Solution solution = new Solution();
		ListNode output = solution.addTwoNumbers(l1, l2);
		assertThat(output.val).isEqualTo(0);
		assertThat(output.next.val).isEqualTo(0);
		assertThat(output.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.next.next.next.next.val).isEqualTo(0);
		assertThat(output.next.next.next.next.next.next.next.next.next.next.val).isEqualTo(1);
		assertThat(output.next.next.next.next.next.next.next.next.next.next.next).isNull();
	}

}
