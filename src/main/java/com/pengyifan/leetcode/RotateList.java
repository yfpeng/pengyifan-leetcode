package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * <p>
 * For example: Given 1->2->3->4->5->NULL and k = 2, return
 * 4->5->1->2->3->NULL.
 */
public class RotateList {

  public ListNode rotateRight(ListNode head, int n) {
    if (head == null) {
      return null;
    }
    int length = 1;
    ListNode p = head;
    while(p.next != null) {
      p = p.next;
      length ++;
    }
    n = n % length;
    // find the nth from last;
    p = head;
    for (int i = 0; i < n; i++) {
      p = p.next;
      if (p == null) {
        return null;
      }
    }
    ListNode newHead = head;
    while (p.next != null) {
      newHead = newHead.next;
      p = p.next;
    }
    p.next = head;
    p = newHead;
    newHead = newHead.next;
    p.next = null;
    return newHead;
  }
}
