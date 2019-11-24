package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Stack;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * For example: Given binary tree {1,#,2,3},
 * 
 * <pre>
 *    1
 *     \
 *      2
 *     /
 *    3
 * </pre>
 * 
 * return [1,3,2].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {

  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> s = new Stack<TreeNode>();
    if (root == null) {
      return list;
    }
    s.push(root);
    TreeNode prev = null;
    while (!s.isEmpty()) {
      TreeNode curr = s.pop();
      if (prev == null || prev.left == curr || prev.right == curr) {
        if (curr.right != null) {
          s.push(curr.right);
        }
        s.push(curr);
        if (curr.left != null) {
          s.push(curr.left);
        }
      } else if (curr.left == null && curr.right == null) {
        list.add(curr.val);
      } else if (curr.right == prev) {
        ;
      } else {
        list.add(curr.val);
      }
      prev = curr;
    }
    return list;
  }
}
