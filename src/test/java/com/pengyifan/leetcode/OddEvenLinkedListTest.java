package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

  private OddEvenLinkedList t = new OddEvenLinkedList();

  @Test
  public void testOddEvenList() throws Exception {
    ListNode a = ListNode.createList(new int[]{1,2,3,4,5});
    System.out.println(t.oddEvenList(a));
  }
}