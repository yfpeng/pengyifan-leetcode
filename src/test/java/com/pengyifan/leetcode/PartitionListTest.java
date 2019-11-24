package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pengyifan.leetcode.commons.ListNode;

public class PartitionListTest {

  PartitionList s = new PartitionList();

  @Test
  public void testPartition() {
    ListNode head = ListNode.createList(new int[] { 2, 1 });
    head = s.partition(head, 2);
    assertEquals(1, head.val);
    head = head.next;
    assertEquals(2, head.val);
    head = head.next;
    assertNull(head);
  }
}
