package com.pengyifan.leetcode;

public class MaximumSubarray {

  public int maxSubArray(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i : A) {
      if (sum < 0) {
        sum = i;
      } else {
        sum += i;
      }
      max = Math.max(max, sum);
    }
    return max;
  }
}
