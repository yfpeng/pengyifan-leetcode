package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeLinkNode;

/**
 * Given a binary tree
 * 
 * <pre>
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 * </pre>
 * 
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * <p>
 * Note:
 * <ul>
 * <li>You may only use constant extra space.
 * <li>You may assume that it is a perfect binary tree (ie, all leaves are at
 * the same level, and every parent has two children).
 * </ul>
 * For example,
 * <p>
 * Given the following perfect binary tree,
 * 
 * <pre>
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 * </pre>
 * 
 * After calling your function, the tree should look like:
 * 
 * <pre>
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
 * </pre>
 */
public class PopulatingNextRightPointersInEachNode {

  public void connect(TreeLinkNode root) {
    if (root == null) {
      ;
    } else if (root.left != null) {
      root.left.next = root.right;
      connect(root.left);
      connect(root.right);
      if (root.left.right != null && root.right.left != null) {
        connect(root.left.right, root.right.left);
      }
    }
  }

  private void connect(TreeLinkNode leftRight, TreeLinkNode rightLeft) {
    leftRight.next = rightLeft;
    if (leftRight.right != null && rightLeft.left != null) {
      connect(leftRight.right, rightLeft.left);
    }
  }
}
