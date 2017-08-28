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