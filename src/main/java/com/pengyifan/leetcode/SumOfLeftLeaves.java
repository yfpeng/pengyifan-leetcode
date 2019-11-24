package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Find the sum of all left leaves in a given binary tree.
 * <p>
 * Example:
 * <pre>
 *    3
 *   / \
 *  9  20
 *  /  \
 * 15   7
 * </pre>
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {
  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return sumOfLeftLeavesHelperLeft(root.left) + sumOfLeftLeavesHelperRight(root.right);
  }

  private int sumOfLeftLeavesHelperLeft(TreeNode root) {
    if (root == null) {
      return 0;
    } else if (root.left == null && root.right == null) {
      return root.val;
    } else {
      return sumOfLeftLeavesHelperLeft(root.left) + sumOfLeftLeavesHelperRight(root.right);
    }
  }

  private int sumOfLeftLeavesHelperRight(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      return sumOfLeftLeavesHelperLeft(root.left) + sumOfLeftLeavesHelperRight(root.right);
    }
  }
}
