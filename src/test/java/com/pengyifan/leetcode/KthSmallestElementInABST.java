package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
public class KthSmallestElementInABST {
  public int kthSmallest(TreeNode root, int k) {
    if (root == null || k == -1) {
      return -1;
    }
    return kthSmallestHelper(root, k)[1];
  }

  // <count, return value>
  private int[] kthSmallestHelper(TreeNode root, int k) {
    if (root == null) {
      return new int[]{0, 0};
    }
    int[] left = kthSmallestHelper(root.left, k);
    if (left[0] == -1) {
      return left;
    }
    if (left[0] == k - 1) {
      left[0] = -1;
      left[1] = root.val;
      return left;
    }
    int[] right = kthSmallestHelper(root.right, k - left[0] - 1);
    if (right[0] == -1) {
      return right;
    }
    right[0] = left[0] + right[0] + 1;
    return right;
  }
}
