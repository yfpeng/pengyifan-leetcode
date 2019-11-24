package com.pengyifan.leetcode;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j),
 * inclusive.
 * <p>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <pre>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * </pre>
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */
public class RangeSumQueryImmutable {

  private int[] sum;

  public RangeSumQueryImmutable(int[] nums) {
    sum = new int[nums.length];
    if (nums.length > 0) {
      sum[0] = nums[0];
      for (int i = 1; i < nums.length; i++) {
        sum[i] = sum[i - 1] + nums[i];
      }
    }
  }

  public int sumRange(int i, int j) {
    if (i < 0 || i >= sum.length || j < 0 || j >= sum.length) {
      throw new Error();
    }
    if (i == 0) {
      return sum[j];
    } else {
      return sum[j] - sum[i - 1];
    }
  }
}

// Your RangeSumQueryImmutable object will be instantiated and called as such:
// RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
