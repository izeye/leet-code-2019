package com.izeye.play.leetcode.problem19;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
public class SolutionTests {

	@Test
	public void removeNthFromEnd() {
		Solution solution = new Solution();

		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);

		ListNode removed = solution.removeNthFromEnd(node, 2);
		assertThat(removed.val).isEqualTo(1);
		assertThat(removed.next.val).isEqualTo(2);
		assertThat(removed.next.next.val).isEqualTo(3);
		assertThat(removed.next.next.next.val).isEqualTo(5);
		assertThat(removed.next.next.next.next).isNull();
	}

	@Test
	public void removeNthFromEndWhenOneNodeExistsShouldReturnNull() {
		Solution solution = new Solution();

		ListNode node = new ListNode(1);

		assertThat(solution.removeNthFromEnd(node, 1)).isNull();
	}

	@Test
	public void removeNthFromEndWhenTwoNodesExistShouldWork() {
		Solution solution = new Solution();

		ListNode node = new ListNode(1);
		node.next = new ListNode(2);

		ListNode removed = solution.removeNthFromEnd(node, 2);
		assertThat(removed.val).isEqualTo(2);
		assertThat(removed.next).isNull();
	}

}
