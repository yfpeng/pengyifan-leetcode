package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * <pre>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    if (l1 != null && l2 == null) {
      return l1;
    }
    if (l1 == null && l2 != null) {
      return l2;
    }
    ListNode head = new ListNode(l1.val + l2.val);
    int carry = head.val / 10;
    head.val %= 10;
    ListNode cur = head;
    l1 = l1.next;
    l2 = l2.next;
    while (l1 != null && l2 != null) {
      cur.next = new ListNode(l1.val + l2.val + carry);
      cur = cur.next;
      carry = cur.val / 10;
      cur.val %= 10;
      l1 = l1.next;
      l2 = l2.next;
    }
    if (l1 != null) {
      cur.next = l1;
    } else {
      cur.next = l2;
    }
    while (cur.next != null && carry != 0) {
      cur.next.val += carry;
      carry = cur.next.val / 10;
      cur.next.val %= 10;
      cur = cur.next;
    }
    if (carry != 0) {
      // new node
      cur.next = new ListNode(carry);
    }
    return head;
  }
}
