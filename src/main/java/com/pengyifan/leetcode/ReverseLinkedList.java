package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode p = head;
    ListNode q = p.next;
    while (q != null) {
      ListNode r = q.next;
      q.next = p;
      p = q;
      q = r;
    }
    head.next = null;
    return p;
  }
}
