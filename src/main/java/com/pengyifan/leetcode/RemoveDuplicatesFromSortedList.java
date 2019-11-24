package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * <p>
 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return
 * 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode cur = head;
    while (cur != null) {
      // contains;
      ListNode tmp = cur;
      while (tmp.next != null) {
        if (tmp.next.val == cur.val) {
          tmp.next = tmp.next.next;
        } else {
          tmp = tmp.next;
        }
      }
      cur = cur.next;
    }
    return head;
  }
}
