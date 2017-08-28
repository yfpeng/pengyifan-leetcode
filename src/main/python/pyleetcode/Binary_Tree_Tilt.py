"""

Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

Example:

Input:
         1
       /   \
      2     3

Output: 1
Explanation:
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1

Note:

The sum of node values in any subtree won't exceed the range of 32-bit integer.
All the tilt values won't exceed the range of 32-bit integer.

"""


from utils import TreeNode


def findTilt(root):
    """
    :type root: TreeNode
    :rtype: int
    """
    if root is None:
        return 0
    return findTilt_helper(root)[1]


def findTilt_helper(tree):
    """Return (sum, diff)"""
    if tree is None:
        return 0, 0
    (sl, dl) = findTilt_helper(tree.left)
    (sr, dr) = findTilt_helper(tree.right)
    return tree.val + sl + sr, dl + dr + abs(sl - sr)


def test_findTilt():
    t1 = TreeNode(1)
    t2 = TreeNode(2)
    t3 = TreeNode(3)
    t1.left = t2
    t1.right = t3
    assert findTilt(t1) == 1, findTilt(t1)

    t4 = TreeNode(4)
    t5 = TreeNode(5)
    t2.left = t4
    t3.left = t5
    assert findTilt(t1) == 11, findTilt(t1)




if __name__ == '__main__':
    test_findTilt()