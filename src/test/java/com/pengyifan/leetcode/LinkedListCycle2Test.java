package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pengyifan.leetcode.commons.ListNode;

public class LinkedListCycle2Test {

  LinkedListCycle2 t = new LinkedListCycle2();

  @Test
  public void test() {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    n1.next = n2;
    assertNull(t.detectCycle(n1));
  }

  @Test
  public void test2() {
    ListNode n1 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(0);
    ListNode n4 = new ListNode(-4);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n1;
    assertEquals(n1, t.detectCycle(n1));
  }
}
