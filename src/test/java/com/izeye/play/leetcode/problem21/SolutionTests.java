package com.izeye.play.leetcode.problem21;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void mergeTwoLists() {
		Solution solution = new Solution();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode merged = solution.mergeTwoLists(l1, l2);

		assertThat(merged.val).isEqualTo(1);
		assertThat(merged.next.val).isEqualTo(1);
		assertThat(merged.next.next.val).isEqualTo(2);
		assertThat(merged.next.next.next.val).isEqualTo(3);
		assertThat(merged.next.next.next.next.val).isEqualTo(4);
		assertThat(merged.next.next.next.next.next.val).isEqualTo(4);
		assertThat(merged.next.next.next.next.next.next).isNull();
	}

	@Test
	public void mergeTwoListsWhenBothAreNullShouldReturnNull() {
		Solution solution = new Solution();
		assertThat(solution.mergeTwoLists(null, null)).isNull();
	}

	@Test
	public void mergeTwoListsWhenFirstIsNullAndSecondIsNotNullShouldReturnSecond() {
		Solution solution = new Solution();
		ListNode l2 = new ListNode(0);
		assertThat(solution.mergeTwoLists(null, l2)).isEqualTo(l2);
	}

}
