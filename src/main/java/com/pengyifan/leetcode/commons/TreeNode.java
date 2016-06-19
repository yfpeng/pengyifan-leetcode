package com.pengyifan.leetcode.commons;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  @Override
  public String toString() {
    return String.valueOf(val);
  }

  public static TreeNode createList(Integer[] ints) {
    TreeNode[] nodes = new TreeNode[ints.length];
    for (int i = ints.length - 1; i >= 0; i--) {
      if (ints[i] != null) {
        nodes[i] = new TreeNode(ints[i]);
      }
      if (i * 2 + 1 < ints.length) {
        nodes[i].left = nodes[i * 2 + 1];
      }
      if (i * 2 + 2 < ints.length) {
        nodes[i].right = nodes[i * 2 + 2];
      }
    }
    return nodes[0];
  }
}
