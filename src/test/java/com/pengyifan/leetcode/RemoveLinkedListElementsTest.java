package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveLinkedListElementsTest {

  private RemoveLinkedListElements t = new RemoveLinkedListElements();

  @Test
  public void testRemoveElements() throws Exception {
    ListNode l1 = ListNode.createList(new int[]{1, 2, 6, 3, 4, 5, 6});
    l1 = t.removeElements(l1, 6);
    assertEquals("1 --> 2 --> 3 --> 4 --> 5", l1.toString());

    l1 = ListNode.createList(new int[]{1, 1});
    l1 = t.removeElements(l1, 1);
    assertEquals(null, l1);
  }
}