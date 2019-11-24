package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode l;
    if (l1.val <= l2.val) {
      l = l1;
      l1 = l1.next;
    } else {
      l = l2;
      l2 = l2.next;
    }
    ListNode cur = l;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        cur.next = l1;
        cur = l1;
        l1 = l1.next;
      } else {
        cur.next = l2;
        cur = l2;
        l2 = l2.next;
      }
    }
    if (l1 != null) {
      cur.next = l1;
    } else {
      cur.next = l2;
    }
    return l;
  }
}
