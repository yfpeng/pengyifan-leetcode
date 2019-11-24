"""
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:

Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /
  4

Output: "1(2(4))(3)"

Explanation: Originallay it needs to be "1(2(4)())(3()())",
but you need to omit all the unnecessary empty parenthesis pairs.
And it will be "1(2(4))(3)".

Example 2:

Input: Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \
      4

Output: "1(2()(4))(3)"

Explanation: Almost the same as the first example,
except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
"""

from utils import TreeNode


def tree2str(t):
    """
    :type t: TreeNode
    :rtype: str
    """
    if not t:
        return ''
    return tree2str_helper(t)


def tree2str_helper(t):
    if t is None:
        return ''
    s = str(t.val)
    if t.left is not None or t.right is not None:
        s += '({})'.format(tree2str_helper(t.left))
        if t.right:
            s += '({})'.format(tree2str_helper(t.right))
    return s


def test_tree2str():
    t1 = TreeNode(1)
    t2 = TreeNode(2)
    t3 = TreeNode(3)
    t4 = TreeNode(4)
    t1.left = t2
    t1.right = t3
    t2.left = t4
    assert tree2str(t1) == '1(2(4))(3)', tree2str(t1)

    t2.left = None
    t2.right = t4
    assert tree2str(t1) == '1(2()(4))(3)', tree2str(t1)

if __name__ == '__main__':
    test_tree2str()