package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up: Can you solve it without using extra space?
 */
public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    if (head.next == null) {
      return false;
    }
    if (head.next == head) {
      return true;
    }
    if (head.next.next == null) {
      return false;
    }
    ListNode slow = head.next;
    ListNode fast = head.next.next;
    while (slow != fast) {
      slow = slow.next;
      if (fast.next == null) {
        return false;
      } else if (fast.next.next == null) {
        return false;
      }
      fast = fast.next.next;
    }

    return true;
  }
}
