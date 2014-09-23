package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * <p>
 * For example, this binary tree is symmetric:
 * 
 * <pre>
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * </pre>
 * 
 * But the following is not:
 * 
 * <pre>
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * </pre>
 * 
 * Note:
 * <p>
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return false;
    }
    return isSymmetricHelper(root.left, root.right);
  }

  private boolean isSymmetricHelper(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    } else if (node1 == null) {
      return false;
    } else if (node2 == null) {
      return false;
    } else if (node1.val != node2.val) {
      return false;
    } else {
      return isSymmetricHelper(node1.left, node2.right)
          && isSymmetricHelper(node1.right, node2.left);
    }
  }
}
