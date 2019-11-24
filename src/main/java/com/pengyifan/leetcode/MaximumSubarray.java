package com.pengyifan.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one
 * number) which has the largest sum.
 * <p>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous
 * subarray [4,−1,2,1] has the largest sum = 6.
 * <p>
 * More practice:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

  public int maxSubArray(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i : A) {
      sum = sum < 0 ? i : sum + i;
      max = Math.max(max, sum);
    }
    return max;
  }
}
