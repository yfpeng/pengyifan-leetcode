"""
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the
start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but
greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:
    Input: s = "abcdefg", k = 2

    Output: "bacdfeg"
Restrictions:
    * The string consists of lower English letters only.
    * Length of the given string and k will in the range [1, 10000]
"""


def reverse_str(s, k):
    """
    :type s: str
    :type k: int
    :rtype: str
    """
    if k == 0:
        return s

    o = ''
    for idx in range(0, len(s), k):
        print idx, s[idx:idx+k]
        if idx/k % 2 == 0:
            o += s[idx:idx+k][::-1]
        else:
            o += s[idx:idx+k]
        idx += k
    return o


def test_reverse_str():
    assert reverse_str('abcdefg', 2) == "bacdfeg"