package com.pengyifan.leetcode.commons;

import java.util.HashSet;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
    next = null;
  }
  
  public String toString() {
    HashSet<ListNode> set = new HashSet<ListNode>();
    StringBuilder sb = new StringBuilder();
    sb.append(val);
    ListNode p = this;
    set.add(p);
    while(p.next != null) {
      p = p.next;
      if (set.contains(p)) {
        break;
      }
      set.add(p);
      sb.append(" --> " + p.val);
    }
    return sb.toString();
  }
  
  public static ListNode createList(int [] ints) {
    ListNode head = new ListNode(ints[0]);
    ListNode p = head;
    for(int i=1; i<ints.length; i++) {
      p.next = new ListNode(ints[i]);
      p = p.next;
    }
    return head;
  }
}
