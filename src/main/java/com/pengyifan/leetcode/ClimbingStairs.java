package com.pengyifan.leetcode;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 */
public class ClimbingStairs {

  // fib
  public int climbStairs(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 2;
    }
    int sum = 0;
    int f1 = 1;
    int f2 = 2;
    for (int i = 3; i <= n; i++) {
      sum = f1 + f2;
      f1 = f2;
      f2 = sum;
    }
    return sum;
  }
}
