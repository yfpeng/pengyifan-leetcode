"""
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
"""

def reverseWords(s):
    """
    :type s: str
    :rtype: str
    """
    if not s:
        return s
    return ' '.join([w[::-1] for w in s.split(' ')])


def test_reverseWords():
    assert reverseWords("Let's take LeetCode contest") == "s'teL ekat edoCteeL tsetnoc"


if __name__ == '__main__':
    test_reverseWords()
