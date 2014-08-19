package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

public class InsertionSortList {

  public ListNode insertionSortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode cur = head;
    while (cur.next != null) {
      ListNode x = cur.next;
      cur.next = cur.next.next;
      ListNode tmp = head;
      if (x.val < tmp.val) {
        x.next = tmp;
        head = x;
      } else {
        while (tmp.next != cur.next && tmp.next.val < x.val) {
          tmp = tmp.next;
        }
        if (tmp.next != cur.next) {
          x.next = tmp.next;
          tmp.next = x;
        } else {
          x.next = tmp.next;
          tmp.next = x;
          cur = cur.next;
        }
      }
    }
    return head;
  }
}
