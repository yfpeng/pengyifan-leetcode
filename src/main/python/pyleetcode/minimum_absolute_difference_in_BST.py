"""Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
Note: There are at least two nodes in this BST."""


def get_minimum_difference(root):
    """
    :type root: TreeNode
    :rtype: int
    """

    def _get_list(t, l):
        if t:
            l += [t.val]
            l = _get_list(t.left, l)
            l = _get_list(t.right, l)
        return l

    l = sorted(_get_list(root, []))
    return  min([abs(l[i] - l[i+1]) for i in range(0, len(l) - 1)])

