"""
Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:
Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7

Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
Note: The merging process must start from the root nodes of both trees.
"""

from utils import TreeNode


def mergeTrees(t1, t2):
    """
    :type t1: TreeNode
    :type t2: TreeNode
    :rtype: TreeNode
    """
    return mergeTrees_helper(t1, t2)


def mergeTrees_helper(t1, t2):
    if t1 is None and t2 is None:
        return None
    elif t1 is None and t2 is not None:
        return t2
    elif t1 is not None and t2 is None:
        return t1
    else:
        t1.val += t2.val
        t1.left = mergeTrees_helper(t1.left, t2.left)
        t1.right = mergeTrees_helper(t1.right, t2.right)
        return t1