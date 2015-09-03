package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInALinkedListTest {

  DeleteNodeInALinkedList t = new DeleteNodeInALinkedList();

  @Test
  public void testDeleteNode() throws Exception {
    ListNode a1 = new ListNode(0);
    ListNode a2 = new ListNode(1);
    ListNode a3 = new ListNode(0);

    a1.next = a2;
    a2.next = a3;

    t.deleteNode(a1);
  }
}