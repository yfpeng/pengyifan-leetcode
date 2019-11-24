"""
Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
"""


def findRelativeRanks(nums):
    """
    :type nums: List[int]
    :rtype: List[str]
    """
    nums_sort = sorted(nums)[::-1]
    ranks = ['Gold Medal', 'Silver Medal', 'Bronze Medal'] + [str(i + 1) for i in range(3, len(nums_sort))]
    d = {n: r for n, r in zip(nums_sort, ranks)}
    return [d[n] for n in nums]


def test_findRelativeRanks():
    expected = ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
    actual = findRelativeRanks([5, 4, 3, 2, 1])
    for s, t in zip(expected, actual):
        assert s == t, '{} vs {}'.format(s, t)

    expected = ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
    actual = findRelativeRanks([10, 3, 8, 9, 4])
    for s, t in zip(expected, actual):
        assert s == t, '{} vs {}'.format(s, t)


if __name__ == '__main__':
    test_findRelativeRanks()
