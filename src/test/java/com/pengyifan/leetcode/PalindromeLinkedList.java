package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    int size = size(head);
    ListNode head2 = secondHalf(head, size);

    head2 = reverseList(head2);
    while (head2 != null) {
      if (head2.val != head.val) {
        return false;
      }
      head2 = head2.next;
      head = head.next;
    }
    return true;
  }

  private ListNode secondHalf(ListNode head, int size) {
    int mid = size / 2;
    for (int i = 0; i < mid - 1; i++) {
      head = head.next;
    }
    if (size % 2 == 0) {
      ListNode q = head;
      head = head.next;
      q.next = null;
    } else {
      ListNode q = head;
      head = head.next.next;
      q.next = null;
    }
    return head;
  }

  private int size(ListNode head) {
    int size = 0;
    ListNode p = head;
    while (p != null) {
      p = p.next;
      size++;
    }
    return size;
  }

  private ListNode reverseList(ListNode head) {
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
