"""
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
where a move is incrementing n - 1 elements by 1.

Example:

    Input:
    [1,2,3]

    Output:
    3

    Explanation:
        Only three moves are needed (remember each move increments two elements):
        [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

Hint:
    Add one to all the other elements is equivalent to subtract one from current element.
"""


def min_moves(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    m = min(nums)
    return sum(i - m for i in nums)


def test_min_moves():
    assert min_moves([1,2,3]) == 3
    assert min_moves([1,2147483647]) == 2147483646

if __name__ == '__main__':
    test_min_moves()