"""
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
    Input: "UD"
    Output: true

Example 2:
    Input: "LL"
    Output: false
"""
import collections


def judge_circle(moves):
    """
    :type moves: str
    :rtype: bool
    """
    c = collections.Counter(moves)
    return c['L'] == c['R'] and c['U'] == c['D']


def test_judge_circle():
    assert judge_circle("UD")
    assert not judge_circle("LL")


if __name__ == '__main__':
    test_judge_circle()