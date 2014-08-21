package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * <p>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * For example,
 * 
 * <pre>
 *   1 
 *  / \ 
 * 2   3
 * </pre>
 * 
 * The root-to-leaf path 1->2 represents the number 12. The root-to-leaf path
 * 1->3 represents the number 13.
 * <p>
 * Return the sum = 12 + 13 = 25.
 */
public class SumRootToLeafNumbers {

  public int sumNumbers(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return sumNumbersHelper(root, 0, 0);
  }

  private int sumNumbersHelper(TreeNode root, int sum, int num) {
    // leaf
    if (root.left == null && root.right == null) {
      return sum + num + root.val;
    }
    num += root.val;
    if (root.left != null) {
      sum = sumNumbersHelper(root.left, sum, num * 10);
    }
    if (root.right != null) {
      sum = sumNumbersHelper(root.right, sum, num * 10);
    }
    return sum;
  }
}
