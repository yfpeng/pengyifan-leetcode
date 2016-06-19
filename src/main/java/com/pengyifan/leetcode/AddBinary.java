package com.pengyifan.leetcode;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * <p>
 * a = "11"
 * <p>
 * b = "1"
 * <p>
 * Return "100".
 */
public class AddBinary {
  public String addBinary(String a, String b) {
    if (a.length() < b.length()) {
      String tmp = a;
      a = b;
      b = tmp;
    }
    String s = "";
    int ai = a.length() - 1;
    int bi = b.length() - 1;
    boolean carry = false;
    while (bi >= 0) {
      char ac = a.charAt(ai);
      char bc = b.charAt(bi);
      if ((ac == '0' && bc == '1') || (ac == '1' && bc == '0')) {
        s = (carry ? '0' : '1') + s;
      } else if ((ac == '0' && bc == '0')) {
        s = (carry ? '1' : '0') + s;
        carry = false;
      } else {
        s = (carry ? '1' : '0') + s;
        carry = true;
      }
      ai--;
      bi--;
    }
    while (ai >= 0) {
      char ac = a.charAt(ai);
      if (ac == '0') {
        s = (carry ? '1' : '0') + s;
        carry = false;
      } else {
        s = (carry ? '0' : '1') + s;
      }
      ai--;
    }
    if (carry) {
      s = '1' + s;
    }
    return s;
  }
}
