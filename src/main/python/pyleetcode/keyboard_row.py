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
