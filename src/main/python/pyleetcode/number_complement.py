"""
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary
representation.

Note:
    - The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    - You could assume no leading zero bit in the integer's binary representation.

Example 1:
    - Input: 5
    - Output: 2
    - Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need
    to output 2.

Example 2:
    - Input: 1
    - Output: 0
    - Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to
    output 0.
"""

def findComplement(num):
    """
    :type num: int
    :rtype: int
    """
    def _get_digit(x):
        n = 0
        while x != 0:
            n += 1
            x /= 2
        return n

    # total = 2 ** 32 - 1
    # return total - num - (total - 2 ** n + 1)
    return 2 ** _get_digit(num) - num - 1


def test_find_complement():
    assert findComplement(5) == 2
    assert findComplement(1) == 0
