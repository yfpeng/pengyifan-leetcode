package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;
import java.util.LinkedList;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the
 * BST.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
 * two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a
 * node to be a descendant of itself).”
 * <pre>
 * _______6______
 * /              \
 * ___2__          ___8__
 * /      \        /      \
 * 0      _4       7       9
 * /  \
 * 3   5
 * </pre>
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of
 * nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestorOfABinarySearchTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    LinkedList<TreeNode> p2root = new LinkedList<>();
    if (!leaf2root(root, p, p2root)) {
      return null;
    }
    LinkedList<TreeNode> q2root = new LinkedList<>();
    if (!leaf2root(root, q, q2root)) {
      return null;
    }
    for (TreeNode lca : p2root) {
      if (contains(q2root, lca)) {
        return lca;
      }
    }
    return null;
  }

  private boolean contains(LinkedList<TreeNode> c, TreeNode t) {
    for (TreeNode x : c) {
      if (x == t) {
        return true;
      }
    }
    return false;
  }

  private boolean leaf2root(TreeNode root, TreeNode leaf, LinkedList<TreeNode> path) {
    if (root == null) {
      return false;
    }
    path.addFirst(root);
    if (root == leaf) {
      return true;
    }
    if (leaf2root(root.left, leaf, path)) {
      return true;
    }
    if (leaf2root(root.right, leaf, path)) {
      return true;
    }
    path.removeFirst();
    return false;
  }
}
