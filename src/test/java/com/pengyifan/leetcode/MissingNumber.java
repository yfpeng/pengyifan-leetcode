package com.pengyifan.leetcode;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is
 * missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only
 * constant extra space complexity?
 */
public class MissingNumber {
  public int missingNumber(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int actual = 0;
    for (int i : nums) {
      actual += i;
    }
    int expected = nums.length * (nums.length + 1) / 2;
    return expected - actual;
  }
}
