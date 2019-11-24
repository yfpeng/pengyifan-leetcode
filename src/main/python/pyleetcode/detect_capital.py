"""
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    1. All letters in this word are capitals, like "USA".
    2. All letters in this word are not capitals, like "leetcode".
    3. Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:
    Input: "USA"

    Output: True

Example 2:
    Input: "FlaG"
    
    Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
"""


def detect_capital_use(word):
    """
    :type word: str
    :rtype: bool
    """
    all_upper = True
    all_lower = True
    first_upper = True
    for i, c in enumerate(word):
        if c.islower():
            all_upper = False
        elif c.isupper():
            all_lower = False
        if i == 0:
            if not c.isupper():
                first_upper = False
        elif c.isupper():
            first_upper = False
    return all_upper or all_lower or first_upper


def test_detect_capital_use():
    assert detect_capital_use('USA') == True
    assert detect_capital_use('FlaG') == False
    assert detect_capital_use('leetcode') == True
    assert detect_capital_use('Google') == True

if __name__ == '__main__':
    test_detect_capital_use()