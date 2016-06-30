package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note
 * here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes)
 * time complexity.
 * <p>
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * <p>
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 */
public class OddEvenLinkedList {
  public ListNode oddEvenList(ListNode head) {
    ListNode odd = null;
    ListNode even = null;
    ListNode op = null;
    ListNode ep = null;
    int n = 1;
    while (head != null) {
      ListNode next = head.next;
      if (n % 2 == 0) {
        if (even == null) {
          even = head;
          ep = even;
        } else {
          ep.next = head;
          ep = head;
        }
      } else {
        if (odd == null) {
          odd = head;
          op = odd;
        } else {
          op.next = head;
          op = head;
        }
      }

      head = next;
      n++;
    }
    if (odd == null) {
      return head;
    } else {
      if (ep != null) {
        ep.next = null;
      }
      op.next = even;
      return odd;
    }
  }
}
