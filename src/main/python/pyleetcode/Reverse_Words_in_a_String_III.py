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
