package com.pengyifan.leetcode;

/**
 * Given a positive integer n, break it into the sum of at least two positive integers and maximize
 * the product of those integers. Return the maximum product you can get.
 * <p>
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * <p>
 * Note: you may assume that n is not less than 2.
 */
public class IntegerBreak {

  public int integerBreak(int n) {
    if (n == 2) {
      return 1;
    }
    if (n == 3) {
      return 2;
    }
    if (n == 4) {
      return 4;
    }
    // 5   6   7  Group 1
    // 32  33  34
    // 8   9   10  Group 2
    // 332 333 334
    // 11    12    13   Group 3
    // 3332  3333  3334
    int groupNumber = (n - 5) / 3 + 1;
    int addition = n - 3 * (groupNumber);
    int res = (int)(Math.pow(3, groupNumber)) * addition;
    return res;
  }
}
