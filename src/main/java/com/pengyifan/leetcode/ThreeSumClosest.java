package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given
 * number, target. Return the sum of the three integers. You may assume that each input would have
 * exactly one solution.
 * <pre>
 *   For example, given array S = {-1 2 1 -4}, and target = 1.
 *   The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * </pre>
 */
public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return Integer.MIN_VALUE;
    }

    nums = sort(nums);

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (isSmaller(sum, target, min)) {
          min = target - sum;
        }
        if (min == 0) {
          return target;
        }
        if (sum <= target) {
          j++;
        } else {
          k--;
        }
      }
    }
    return target - min;
  }

  private boolean isSmaller(int sum, int target, int min) {
    return Math.abs(min) > Math.abs(target - sum);
  }

  private int[] sort(int[] nums) {
    Arrays.sort(nums);
    return nums;
  }
}
