package com.pengyifan.leetcode;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {
  public int trailingZeroes(int n) {
    int sum = 0;
    while (n != 0) {
      n /= 5;
      sum += n;
    }
    return sum;
  }
}
