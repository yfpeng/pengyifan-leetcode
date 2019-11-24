package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * The thief has found himself a new place for his thievery again. There is only one entrance to
 * this area, called the "root." Besides the root, each house has one and only one parent house.
 * After a tour, the smart thief realized that "all houses in this place forms a binary tree". It
 * will automatically contact the police if two directly-linked houses were broken into on the same
 * night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * <pre>
 *   3
 *  / \
 * 2   3
 *  \   \
 *   3   1
 * </pre>
 * Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * Example 2:
 * <pre>
 *     3
 *    / \
 *   4   5
 *  / \   \
 * 1   3   1
 * </pre>
 * Maximum amount of money the thief can rob = 4 + 5 = 9.
 */
public class HouseRobberIII {
  public int rob(TreeNode root) {
    return robHelper(root, true);
  }

  private int robHelper(TreeNode t, boolean countThisNode) {
    if (t == null) {
      return 0;
    }
    if (countThisNode) {
      int x = t.val + robHelper(t.left, false) + robHelper(t.right, false);
      int y = robHelper(t.left, true) + robHelper(t.right, true);
      return Math.max(x, y);
    } else {
      return robHelper(t.left, true) + robHelper(t.right, true);
    }
  }
}
