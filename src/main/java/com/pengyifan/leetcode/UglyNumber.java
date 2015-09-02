package com.pengyifan.leetcode;

/**
 * Write a program to check whether a given number is an ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are
 * ugly while 14 is not ugly since it includes another prime factor 7.
 * <p>
 * Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
  public boolean isUgly(int num) {
    if (num == 0) {
      return false;
    }
    if (num == 1) {
      return true;
    }
    int r = num % 2;
    while (r == 0) {
      num = num / 2;
      r = num % 2;
    }
    r = num % 3;
    while (r == 0) {
      num = num / 3;
      r = num % 3;
    }
    r = num % 5;
    while (r == 0) {
      num = num / 5;
      r = num % 5;
    }
    return num == 1;
  }
}
