package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;


public class PartitionList {
  public ListNode partition(ListNode head, int x) {
    if (head == null || head.next == null) {
      return head;
    }
    
    ListNode head1 = new ListNode(0);
    ListNode head2 = new ListNode(0);
    
    ListNode p = head1;
    ListNode q = head2;
    while (head != null) {
      if (head.val < x) {
        p.next = head;
        p = head;
      } else {
        q.next = head;
        q = head;
      }
      head = head.next;
    }
    p.next = head2.next;
    q.next = null;
    return head1.next;
  } 
}
