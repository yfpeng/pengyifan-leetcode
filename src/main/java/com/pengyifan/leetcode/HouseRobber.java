package com.pengyifan.leetcode;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed, the only constraint stopping you from robbing each of them is that
 * adjacent houses have security system connected and it will automatically contact the police if
 * two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine
 * the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int[] mem = new int[nums.length];
    for (int i = 0; i < mem.length; i++) {
      mem[i] = Integer.MIN_VALUE;
    }
    robHelper(nums, 0, mem);
    return mem[0];
  }

  private int robHelper(int[] nums, int from, int[] mem) {
    if (from == nums.length - 1) {
      mem[from] = nums[from];
      return nums[from];
    }
    if (from >= nums.length) {
      return 0;
    }
    if (mem[from] == Integer.MIN_VALUE) {
      int i1 = nums[from] + robHelper(nums, from + 2, mem);
      int i2 = nums[from + 1] + robHelper(nums, from + 3, mem);
      mem[from] = Math.max(i1, i2);
    }
    return mem[from];
  }
}
