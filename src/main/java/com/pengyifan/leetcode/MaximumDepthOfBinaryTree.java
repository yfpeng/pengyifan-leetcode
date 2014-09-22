package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return maxDepthHelper(root);
  }

  private int maxDepthHelper(TreeNode node) {
    if (node.left == null && node.right == null) {
      return 1;
    } else if (node.left == null) {
      return maxDepth(node.right) + 1;
    } else if (node.right == null) {
      return maxDepth(node.left) + 1;
    } else {
      return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
  }
}
