package com.izeye.play.leetcode.problem23;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void mergeKLists() {
		Solution solution = new Solution();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);

		ListNode merged = solution.mergeKLists(new ListNode[] { l1, l2, l3 });

		assertThat(merged.val).isEqualTo(1);
		assertThat(merged.next.val).isEqualTo(1);
		assertThat(merged.next.next.val).isEqualTo(2);
		assertThat(merged.next.next.next.val).isEqualTo(3);
		assertThat(merged.next.next.next.next.val).isEqualTo(4);
		assertThat(merged.next.next.next.next.next.val).isEqualTo(4);
		assertThat(merged.next.next.next.next.next.next.val).isEqualTo(5);
		assertThat(merged.next.next.next.next.next.next.next.val).isEqualTo(6);
		assertThat(merged.next.next.next.next.next.next.next.next).isNull();
	}

}
