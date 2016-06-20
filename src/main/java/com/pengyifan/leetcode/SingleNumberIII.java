package com.pengyifan.leetcode;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other
 * elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only
 * constant space complexity?
 */
public class SingleNumberIII {
  /**
   * Find the rightmost set bit, divide numbers into two groups. Each group will end up being one
   * unique number.
   */
  public int[] singleNumber(int[] nums) {
    int xor = nums[0];
    for (int i = 1; i < nums.length; i++) {
      xor ^= nums[i];
    }

    int bit = xor & ~(xor - 1);
    int num1 = 0;
    int num2 = 0;

    for (int num : nums) {
      if ((num & bit) > 0) {
        num1 ^= num;
      } else {
        num2 ^= num;
      }
    }
    return new int[]{num1, num2};
  }
}
