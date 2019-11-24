package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * For example, given the following binary tree:
 * <pre>
 *   1
 * /   \
 * 2     3
 * \
 * 5
 * </pre>
 * All root-to-leaf paths are:
 * <p>
 * ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return new LinkedList<>();
    }
    LinkedList<TreeNode> path = new LinkedList<>();
    List<String> rst = new LinkedList<>();
    root2leaf(root, path, rst);
    return rst;
  }

  private void root2leaf(TreeNode root, LinkedList<TreeNode> path, List<String> done) {
    // add root
    path.add(root);
    if (root.left == null && root.right == null) {
      done.add(toString(path));
    } else {
      if (root.left != null) {
        root2leaf(root.left, path, done);
      }
      if (root.right != null) {
        root2leaf(root.right, path, done);
      }
    }
    path.removeLast();
  }

  private String toString(LinkedList<TreeNode> path) {
    StringBuilder sb = new StringBuilder();
    sb.append(path.get(0).val);
    for (int i = 1; i < path.size(); i++) {
      sb.append("->" + path.get(i).val);
    }
    return sb.toString();
  }
}
