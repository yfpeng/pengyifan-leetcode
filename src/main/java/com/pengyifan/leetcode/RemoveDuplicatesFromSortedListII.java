package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * <p>
 * For example,
 * <p>
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * <p>
 * Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesFromSortedListII {

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    // fake head
    ListNode p = new ListNode(0);
    p.next = head;
    head = p;

    p = head;
    while (p.next != null) {
      ListNode next = p.next;
      while (next.next != null && next.val == next.next.val) {
        next = next.next;
      }
      if (p.next == next) {
        p = p.next;
      } else {
        p.next = next.next;
      }
    }
    return head.next;
  }
}
