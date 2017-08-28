"""
Given an integer, return its base 7 string representation.

Example 1:
    Input: 100

    Output: "202"
Example 2:
    Input: -7
    
    Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
"""


def convert_to_base7(num):
    """
    :type num: int
    :rtype: str
    """
    if num == 0:
        return '0'
    o = ''
    a = abs(num)
    while a != 0:
        o = str(a % 7) + o
        a /= 7
    return o if num > 0 else '-' + o


def test_convert_to_base7():
    assert convert_to_base7(100) == '202'
    assert convert_to_base7(-7) == '-10'
    assert convert_to_base7(0) == '0'


if __name__ == '__main__':
    test_convert_to_base7()