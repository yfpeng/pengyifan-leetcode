"""
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
    0 <= x, y < 231.

Example:

    Input: x = 1, y = 4

    Output: 2

Explanation:

1   (0 0 0 1)
4   (0 1 0 0)
       ^   ^

The above arrows point to positions where the corresponding bits are different.
"""


def hamming_distance(x, y):
    """
    :type x: int
    :type y: int
    :rtype: int
    """
    n = 0
    while x != 0 and y != 0:
        if x % 2 != y % 2:
            n += 1
        x /= 2
        y /= 2
    m = x if x != 0 else y
    if m != 0:
        while m != 0:
            if m % 2 == 1:
                n += 1
            m /= 2
    return n


def test_hammingDistance():
    assert hamming_distance(1, 4) == 2