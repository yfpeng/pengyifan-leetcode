package com.pengyifan.leetcode;

import com.pengyifan.leetcode.commons.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
 * two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a
 * node to be a descendant of itself).”
 * <pre>
 *        _______3______
 *       /              \
 *   ___5__          ___1__
 *  /      \        /      \
 * 6      _2       0       8
 *       /  \
 *      7   4
 * </pre>
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of
 * nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestorOfABinaryTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) {
      return null;
    }
    LinkedList<TreeNode> pList = new LinkedList<>();
    LinkedList<TreeNode> qList = new LinkedList<>();

    findPath(root, p, pList);
    findPath(root, q, qList);

    Iterator<TreeNode> itr = qList.descendingIterator();
    while (itr.hasNext()) {
      TreeNode t = itr.next();
      if (pList.contains(t)) {
        return t;
      }
    }
    return null;
  }

  private boolean findPath(TreeNode root, TreeNode target, LinkedList<TreeNode> list) {
    if (root == null) {
      return false;
    }
    list.add(root);
    if (root == target) {
      return true;
    }
    boolean found = findPath(root.left, target, list);
    if (found) {
      return true;
    }
    found = findPath(root.right, target, list);
    if (found) {
      return true;
    }
    list.removeLast();
    return false;
  }
}
