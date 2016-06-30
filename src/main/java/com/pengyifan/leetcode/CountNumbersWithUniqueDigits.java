package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 * <p>
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100,
 * excluding [11,22,33,44,55,66,77,88,99])
 * <p>
 * f(0) = 1
 * <p>
 * f(1) = 10
 * <p>
 * f(2) = 9*9 + f(1)
 * <p>
 * f(3) = 9*9*8 + f(2) + f(1)
 */
public class CountNumbersWithUniqueDigits {
  public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) {
      return 1;
    }
    List<Integer> list = new ArrayList<>();
    list.add(10);
    int f = 9;
    int x = 9;
    for (int i = 2; i <= n; i++) {
      f *= x;
      x--;
      list.add(f);
    }
    int sum = 0;
    for (int i : list) {
      sum += i;
    }
    return sum;
  }
}
