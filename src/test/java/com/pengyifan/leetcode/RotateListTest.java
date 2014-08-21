package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pengyifan.leetcode.commons.ListNode;


public class RotateListTest {

  RotateList t = new RotateList();
  
  @Test
  public void testRotateRight() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    ListNode actual = t.rotateRight(a, 2);
    assertEquals(4, actual.val);
    actual = actual.next;
    assertEquals(5, actual.val);
    actual = actual.next;
    assertEquals(1, actual.val);
    actual = actual.next;
    assertEquals(2, actual.val);
    actual = actual.next;
    assertEquals(3, actual.val);
    actual = actual.next;
    assertEquals(null, actual);
  }

  @Test
  public void testRotateRight2() {
    ListNode a = new ListNode(1);
    ListNode actual = t.rotateRight(a, 1);
    assertEquals(1, actual.val);
  }
  
  @Test
  public void testRotateRight3() {
    ListNode a = new ListNode(1);
    ListNode actual = t.rotateRight(a, 99);
    assertEquals(1, actual.val);
  }
}
