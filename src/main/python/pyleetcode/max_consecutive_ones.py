"""
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
    Input: [1,1,0,1,1,1]

    Output: 3

    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.

Note:
    - The input array will only contain 0 and 1.
    - The length of input array is a positive integer and will not exceed 10,000
"""


def find_max_consecutive_ones(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    total_m = 0
    sub_m = 0
    for i in nums:
        if i == 1:
            sub_m += 1
        else:
            total_m = max(total_m, sub_m)
            sub_m = 0
    return max(total_m, sub_m)


def test_find_max_consecutive_ones():
    assert find_max_consecutive_ones([1,1,0,1,1,1]) == 3

if __name__ == '__main__':
    test_find_max_consecutive_ones()