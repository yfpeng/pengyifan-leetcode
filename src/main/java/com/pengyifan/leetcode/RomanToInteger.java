package com.pengyifan.leetcode;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

  public int romanToInt(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    int rst = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
      case 'I':
        rst += 1;
        break;
      case 'V':
        if (i > 0 && s.charAt(i - 1) == 'I') {
          rst += 3;
        } else {
          rst += 5;
        }
        break;
      case 'X':
        if (i > 0 && s.charAt(i - 1) == 'I') {
          rst += 8;
        } else {
          rst += 10;
        }
        break;
      case 'L':
        if (i > 0 && s.charAt(i - 1) == 'X') {
          rst += 30;
        } else {
          rst += 50;
        }
        break;
      case 'C':
        if (i > 0 && s.charAt(i - 1) == 'X') {
          rst += 80;
        } else {
          rst += 100;
        }
        break;
      case 'D':
        if (i > 0 && s.charAt(i - 1) == 'C') {
          rst += 300;
        } else {
          rst += 500;
        }
        break;
      case 'M':
        if (i > 0 && s.charAt(i - 1) == 'C') {
          rst += 800;
        } else {
          rst += 1000;
        }
        break;
      }
    }
    return rst;
  }
}
