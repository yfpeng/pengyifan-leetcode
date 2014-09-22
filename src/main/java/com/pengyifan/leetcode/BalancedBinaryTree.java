package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 */
public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return helper(root).b;
  }

  public Pair helper(TreeNode root) {
    if (root == null) {
      return new Pair(true, 0);
    }
    Pair left = helper(root.left);
    Pair right = helper(root.right);
    if (!left.b || !right.b) {
      return new Pair(false, -1);
    }
    if (Math.abs(left.height - right.height) <= 1) {
      return new Pair(true, Math.max(left.height, right.height) + 1);
    }
    return new Pair(false, -1);
  }

  class Pair {

    int height;
    boolean b;

    Pair(boolean b, int height) {
      this.b = b;
      this.height = height;
    }
  }
}
