package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pengyifan.leetcode.commons.ListNode;


public class RemoveDuplicatesFromSortedListIITest {
  
  RemoveDuplicatesFromSortedListII s = new RemoveDuplicatesFromSortedListII();

  @Test
  public void testDeleteDuplicates() {
    int [] list = new int[] {1,2,3,3,4,4,5};
    ListNode head = creatList(list);
    head = s.deleteDuplicates(head);
    assertEquals(1, head.val);
    head = head.next;
    assertEquals(2, head.val);
    head = head.next;
    assertEquals(5, head.val);
  }

  @Test
  public void testDeleteDuplicates2() {
    int [] list = new int[] {1,1,1,2,3};
    ListNode head = creatList(list);
    head = s.deleteDuplicates(head);
    assertEquals(2, head.val);
    head = head.next;
    assertEquals(3, head.val);
  }

  private ListNode creatList(int[] list) {
    ListNode head = new ListNode(list[0]);
    ListNode p = head;
    for(int i=1; i<list.length; i++) {
      p.next = new ListNode(list[i]);
      p = p.next;
    }
    return head;
  }
}
