package com.pengyifan.leetcode;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * <p>
 * Example2: x = -123, return -321
 * <p>
 * Have you thought about this?
 * <p>
 * Here are some good questions to ask before coding. Bonus points for you if
 * you have already thought through this!
 * <p>
 * If the integer's last digit is 0, what should the output be? ie, cases such
 * as 10, 100.
 * <p>
 * Did you notice that the reversed integer might overflow? Assume the input is
 * a 32-bit integer, then the reverse of 1000000003 overflows. How should you
 * handle such cases?
 * <p>
 * Throw an exception? Good, but what if throwing an exception is not an
 * option? You would then have to re-design the function (ie, add an extra
 * parameter).
 */
public class ReverseInteger {

  public int reverse(int x) {
    boolean neg = x < 0 ? true : false;
    if (neg) {
      x = -1 * x;
    }
    int rev = 0;
    while (x > 0) {
      int d = x % 10;
      rev = 10 * rev + d;
      x /= 10;
    }
    if (neg) {
      rev = -1 * rev;
      if (rev >= 0) {
        // overflow
        throw new RuntimeException("overflow");
      }
    } else {
      if (rev < 0) {
        // overflow
        throw new RuntimeException("overflow");
      }
    }
    return rev;
  }
}
