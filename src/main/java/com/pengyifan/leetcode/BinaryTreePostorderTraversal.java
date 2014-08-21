package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Stack;

import com.pengyifan.leetcode.commons.TreeNode;

public class BinaryTreePostorderTraversal {

  public ArrayList<Integer> postorderTraversal(TreeNode root) {
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
          stack.push(cur.left);
        } else if (cur.right != null) {
          stack.push(cur.right);
        } else {
          stack.pop();
          list.add(cur.val);
        }
      } else if (pre == cur.left) {
        if (cur.right != null) {
          stack.push(cur.right);
        } else {
          stack.pop();
          list.add(cur.val);
        }
      }
      else if (pre == cur.right) {
        stack.pop();
        list.add(cur.val);
      }
      pre = cur;
    }
    return list;
  }
}
