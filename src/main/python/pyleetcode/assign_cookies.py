"""
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most
one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content
with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will
be content. Your goal is to maximize the number of your content children and output the maximum number.

Note:
    * You may assume the greed factor is always positive.
    * You cannot assign more than one cookie to one child.

Example 1:
    Input: [1,2,3], [1,1]

    Output: 1

    Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
        And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed
        factor is 1 content.
        You need to output 1.

Example 2:
    Input: [1,2], [1,2,3]

    Output: 2

    Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
        You have 3 cookies and their sizes are big enough to gratify all of the children,
        You need to output 2.
"""


def find_content_children(g, s):
    """
    :type g: List[int]
    :type s: List[int]
    :rtype: int
    """
    if not g or not s:
        return 0

    g = sorted(g)
    s = sorted(s)

    gidx = 0
    sidx = 0
    count = 0
    while gidx < len(g) and sidx < len(s):
        if g[gidx] <= s[sidx]:
            count += 1
            gidx += 1
            sidx += 1
        else:
            sidx += 1
    return count


def test_find_conent_children():
    assert find_content_children([1,2,3], [1,1]) == 1
    assert find_content_children([1,2], [1,2,3]) == 2
    assert find_content_children([1,2,3], []) == 0
    assert find_content_children([10,9,8,7], [5,6,7,8]) == 2
