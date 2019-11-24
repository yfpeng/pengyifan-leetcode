package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Invert a binary tree.
 * <pre>
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * </pre>
 * to
 * <pre>
 *       4
 *     /   \
 *    7     2
 *   / \   / \
 * 9   6 3   1
 * </pre>
 */
public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    invertTreeHelper(root);
    return root;
  }

  private void invertTreeHelper(TreeNode root) {
    if (root == null) {
      return;
    }
    invertTreeHelper(root.left);
    invertTreeHelper(root.right);
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
    return;
  }
}
