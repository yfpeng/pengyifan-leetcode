package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class BinaryTreePathsTest {

  private BinaryTreePaths t = new BinaryTreePaths();

  @Test
  public void testBinaryTreePaths() throws Exception {
    Integer[] ints = new Integer[]{1, 2, 3, null, 5};
    TreeNode r = TreeNode.createList(ints);
    List<String> rst = t.binaryTreePaths(r);
    assertThat(rst, containsInAnyOrder("1->2->5", "1->3"));
  }
}