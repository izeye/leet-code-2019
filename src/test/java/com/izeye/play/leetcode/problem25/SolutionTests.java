package com.izeye.play.leetcode.problem25;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void reverseKGroup() {
		Solution solution = new Solution();

		ListNode reversed = solution.reverseKGroup(createList(), 2);

		assertThat(reversed.val).isEqualTo(2);
		assertThat(reversed.next.val).isEqualTo(1);
		assertThat(reversed.next.next.val).isEqualTo(4);
		assertThat(reversed.next.next.next.val).isEqualTo(3);
		assertThat(reversed.next.next.next.next.val).isEqualTo(5);
		assertThat(reversed.next.next.next.next.next).isNull();

		reversed = solution.reverseKGroup(createList(), 3);

		assertThat(reversed.val).isEqualTo(3);
		assertThat(reversed.next.val).isEqualTo(2);
		assertThat(reversed.next.next.val).isEqualTo(1);
		assertThat(reversed.next.next.next.val).isEqualTo(4);
		assertThat(reversed.next.next.next.next.val).isEqualTo(5);
		assertThat(reversed.next.next.next.next.next).isNull();
	}

	private ListNode createList() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		return l1;
	}

}
