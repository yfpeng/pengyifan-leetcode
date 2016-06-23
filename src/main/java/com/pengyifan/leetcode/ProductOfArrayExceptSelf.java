package com.pengyifan.leetcode;

/**
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 */
public class ProductOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int[] p = new int[nums.length];

    int product = 1;
    for (int i = 0; i < p.length; ++i) {
      p[i] = product;
      product *= nums[i];
    }

    product = 1;
    for (int i = p.length - 1; i >= 0; --i) {
      p[i] *= product;
      product *= nums[i];
    }
    return p;
  }
}
