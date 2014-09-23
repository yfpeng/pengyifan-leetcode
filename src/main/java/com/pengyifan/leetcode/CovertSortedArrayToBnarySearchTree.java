package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 */
public class CovertSortedArrayToBnarySearchTree {

  public TreeNode sortedArrayToBST(int[] num) {
    if (num == null || num.length == 0) {
      return null;
    }
    return sortedArraytoBSTHelper(num, 0, num.length);
  }

  private TreeNode sortedArraytoBSTHelper(int[] num, int start, int end) {
    if (start >= end) {
      return null;
    }
    int mid = (start + end)/2;
    TreeNode root = new TreeNode(num[mid]);
    root.left = sortedArraytoBSTHelper(num, start, mid);
    root.right = sortedArraytoBSTHelper(num, mid+1, end);
    return root;
  }
}
