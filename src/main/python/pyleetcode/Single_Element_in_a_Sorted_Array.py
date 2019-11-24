"""
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

Example 1:

Input: [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:

Input: [3,3,7,7,10,11,11]
Output: 10

Note: Your solution should run in O(log n) time and O(1) space.
"""
def singleNonDuplicate(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    return singleNonDuplicate_helper(nums, 0, len(nums) - 1)


def singleNonDuplicate_helper(num, start, end):
    if start >= end:
        return num[start]
    mid = int((start + end) / 2)
    if num[mid] == num[mid ^ 1]:
        return singleNonDuplicate_helper(num, mid + 1, end)
    else:
        return singleNonDuplicate_helper(num, start, mid)



def singleNonDuplicate_linear(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    sum = 0
    for i, n in enumerate(nums):
        if i % 2 == 0:
            sum += n
        else:
            sum -= n
            if sum != 0:
                return nums[i - 1]
    if sum != 0:
        return nums[-1]


def test_singleNonDuplicate():
    assert singleNonDuplicate([1, 1, 2]) == 2
    assert singleNonDuplicate([1, 1, 2, 3, 3, 4, 4, 8, 8]) == 2
    assert singleNonDuplicate([3, 3, 7, 7, 10, 11, 11]) == 10
    assert singleNonDuplicate([0, 1, 1]) == 0


if __name__ == '__main__':
    test_singleNonDuplicate()
