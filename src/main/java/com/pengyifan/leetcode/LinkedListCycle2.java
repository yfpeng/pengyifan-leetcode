package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * <p>
 * Follow up: Can you solve it without using extra space?
 */
public class LinkedListCycle2 {

  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode begin1 = head;
    ListNode begin2 = head;
    begin1 = begin1.next;
    begin2 = begin2.next;
    if (begin2 == null) {
      return null;
    }
    begin2 = begin2.next;
    if (begin2 == null) {
      return null;
    }
    while (begin1 != begin2) {
      begin1 = begin1.next;
      begin2 = begin2.next;
      if (begin2 == null) {
        return null;
      }
      begin2 = begin2.next;
      if (begin2 == null) {
        return null;
      }
    }
    begin1 = head;
    while (begin1 != begin2) {
      begin1 = begin1.next;
      begin2 = begin2.next;
    }
    return begin1;
  }
}
