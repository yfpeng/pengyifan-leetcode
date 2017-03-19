"""
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American
keyboard like the image below.

Example 1:
    Input: ["Hello", "Alaska", "Dad", "Peace"]
    Output: ["Alaska", "Dad"]

Note:
    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.

"""

def findWords(words):
    """
    :type words: List[str]
    :rtype: List[str]
    """
    keyboards = ['qwertyuiop',
                 'asdfghjkl',
                 'zxcvbnm',]
    out = []
    for word in words:
        for row in keyboards:
            in_row = False
            not_in_row = False
            for c in word.lower():
                if c in row:
                    in_row = True
                else:
                    not_in_row = True
            if in_row and not not_in_row:
                out.append(word)
                break
    return out


def test_find_words():
    input = ["Hello","Alaska","Dad","Peace"]
    expected = ["Alaska","Dad"]
    assert findWords(input) == expected

    input = ["asdfghjkl","qwertyuiop","zxcvbnm"]
    expected = ["asdfghjkl","qwertyuiop","zxcvbnm"]
    assert findWords(input) == expected
