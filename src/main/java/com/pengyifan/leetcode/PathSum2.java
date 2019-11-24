package com.pengyifan.leetcode;

import java.util.ArrayList;
import com.pengyifan.leetcode.commons.TreeNode;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's
 * sum equals the given sum. For example: Given the below binary tree and sum =
 * 22,
 * 
 * <pre>
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * </pre>
 * 
 * return
 * 
 * [ [5,4,11,2], [5,8,4,5] ]
 */
public class PathSum2 {

  public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
    if (root == null) {
      return all;
    }
    helper(root, sum, 0, new ArrayList<Integer>(), all);
    return all;
  }

  public void helper(TreeNode root, int sum, int x, ArrayList<Integer> path,
      ArrayList<ArrayList<Integer>> all) {
    x += root.val;
    path.add(root.val);
    if (x == sum && root.left == null && root.right == null) {
      all.add(new ArrayList<Integer>(path));
    } else {
      if (root.left != null) {
        helper(root.left, sum, x, path, all);
      }
      if (root.right != null) {
        helper(root.right, sum, x, path, all);
      }
    }
    path.remove(path.size() - 1);
    return;
  }
}
