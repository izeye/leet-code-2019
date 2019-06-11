package com.izeye.play.leetcode.problem24;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void swapPairs() {
		Solution solution = new Solution();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);

		ListNode merged = solution.swapPairs(l1);

		assertThat(merged.val).isEqualTo(2);
		assertThat(merged.next.val).isEqualTo(1);
		assertThat(merged.next.next.val).isEqualTo(4);
		assertThat(merged.next.next.next.val).isEqualTo(3);
		assertThat(merged.next.next.next.next).isNull();
	}

	@Test
	public void swapPairsWhenListHasThreeNodes() {
		Solution solution = new Solution();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

		ListNode merged = solution.swapPairs(l1);

		assertThat(merged.val).isEqualTo(2);
		assertThat(merged.next.val).isEqualTo(1);
		assertThat(merged.next.next.val).isEqualTo(3);
		assertThat(merged.next.next.next).isNull();
	}

	@Test
	public void swapPairsWhenListHasOneNode() {
		Solution solution = new Solution();

		ListNode l1 = new ListNode(1);

		ListNode merged = solution.swapPairs(l1);

		assertThat(merged.val).isEqualTo(1);
		assertThat(merged.next).isNull();
	}

}
