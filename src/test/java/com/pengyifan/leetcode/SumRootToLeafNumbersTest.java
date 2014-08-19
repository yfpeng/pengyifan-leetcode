package com.pengyifan.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pengyifan.leetcode.commons.TreeNode;

public class SumRootToLeafNumbersTest {

  SumRootToLeafNumbers t = new SumRootToLeafNumbers();

  @Test
  public void test() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    t1.left = t2;
    t1.right = t3;
    assertEquals(25, t.sumNumbers(t1));
  }

  @Test
  public void test_null() {
    assertEquals(0, t.sumNumbers(null));
  }
}
