package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a linked list and a value x, partition it such that all nodes less
 * than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * <p>
 * For example,
 * <p>
 * Given 1->4->3->2->5->2 and x = 3,
 * <p>
 * return 1->2->2->4->3->5.
 */
public class PartitionList {

  public ListNode partition(ListNode head, int x) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode head1 = new ListNode(0);
    ListNode head2 = new ListNode(0);

    ListNode p = head1;
    ListNode q = head2;
    while (head != null) {
      if (head.val < x) {
        p.next = head;
        p = head;
      } else {
        q.next = head;
        q = head;
      }
      head = head.next;
    }
    p.next = head2.next;
    q.next = null;
    return head1.next;
  }
}
