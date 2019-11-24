package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * <p>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode p = new ListNode(0);
    p.next = head;
    head = p;
    while(p.next != null && p.next.next != null) {
      ListNode a = p.next;
      ListNode b = a.next;
      ListNode c = b.next;
      p.next = b;
      b.next = a;
      a.next = c;
      p = a;
    }
    return head.next;
  }
}
