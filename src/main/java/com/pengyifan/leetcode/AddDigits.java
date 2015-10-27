package com.pengyifan.leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one
 * digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return
 * it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits {
  public int addDigits(int num) {
    return addDigitsHelper(num);
  }

  private int addDigitsHelper(int num) {
    if (num < 10) {
      return num;
    }
    int i = 0;
    while (num != 0) {
      i += num % 10;
      num = num / 10;
    }
    return addDigitsHelper(i);
  }
}
