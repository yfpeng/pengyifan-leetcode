package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Stack;

import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example:
 * <p>
 * Given binary tree {1,#,2,3},
 * 
 * <pre>
 *    1
 *     \
 *      2
 *     /
 *    3
 * </pre>
 * 
 * return [1,2,3].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {

  public ArrayList<Integer> preorderTraversal(TreeNode root) {
    if (root == null) {
      return new ArrayList<Integer>();
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    TreeNode pre = null;
    while (!stack.isEmpty()) {
      TreeNode cur = stack.peek();
      if (pre == null || pre.left == cur || pre.right == cur) {
        if (cur.left != null) {
          list.add(cur.val);
          stack.push(cur.left);
        } else if (cur.right != null) {
          list.add(cur.val);
          stack.push(cur.right);
        } else {
          list.add(cur.val);
          stack.pop();
        }
      } else if (pre == cur.left) {
        if (cur.right != null) {
          stack.push(cur.right);
        } else {
          stack.pop();
        }
      } else if (pre == cur.right) {
        stack.pop();
      }
      pre = cur;
    }
    return list;
  }
}
