package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIIITest {

  private HouseRobberIII t = new HouseRobberIII();

  @Test
  public void testRob() throws Exception {
    assertEquals(7, t.rob(TreeNode.createList(new Integer[]{3, 2, 3, null, 3, null, 1})));
    assertEquals(9, t.rob(TreeNode.createList(new Integer[]{3, 4, 5, 1, 3, null, 1})));

    System.out.println(t.rob(TreeNode.createList(new Integer[]{3, 4, 5, 1, 3, null, 1})));
  }
}