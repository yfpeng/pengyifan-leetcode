package com.pengyifan.leetcode;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
  public String reverseString(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    return new StringBuilder(s).reverse().toString();
  }
}
