package com.pengyifan.leetcode;

public class NumberOfDigitOne {
  public int countDigitOne(int n) {
    if (n == 0) {
      return 0;
    } else if (1 <= n && n <= 9) {
      return 1;
    }
    // x: first digit
    int y = 1;
    int x = n;
    while (x >= 10) {
      x /= 10;
      y *= 10;
    }
    if (x == 1) {
      return n - y + 1 + countDigitOne(y - 1) + countDigitOne(n % y);
    } else {
      return y + x * countDigitOne(y - 1) + countDigitOne(n % y);
    }
  }
}
