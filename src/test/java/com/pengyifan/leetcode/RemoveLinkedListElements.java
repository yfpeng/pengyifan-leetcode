package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * <p>
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * <p>
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    return removeHelper(head, val);
  }

  private ListNode removeHelper(ListNode head, int val) {
    if (head == null) {
      return null;
    } else if (head.val == val) {
      return removeHelper(head.next, val);
    } else {
      head.next = removeHelper(head.next, val);
      return head;
    }
  }
}
