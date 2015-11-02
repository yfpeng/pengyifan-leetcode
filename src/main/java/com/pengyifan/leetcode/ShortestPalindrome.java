package com.pengyifan.leetcode;

/**
 * Given a string S, you are allowed to convert it to a palindrome by adding characters in front of
 * it. Find and return the shortest palindrome you can find by performing this transformation.
 * <p>
 * For example:
 * <p>
 * Given "aacecaaa", return "aaacecaaa".
 * <p>
 * Given "abcd", return "dcbabcd".
 */
public class ShortestPalindrome {
  public String shortestPalindrome(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    char[] chars = s.toCharArray();
    for (int i = chars.length - 1; i >= 1; i--) {
      if (isPalindrome(chars, i)) {
        return reverse(s.substring(i + 1)) + s;
      }
    }
    return reverse(s.substring(1)) + s;
  }

  private String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  private boolean isPalindrome(char[] chars, int end) {
    for (int i = 0; i < (end + 1) / 2; i++) {
      if (chars[i] != chars[end - i]) {
        return false;
      }
    }
    return true;
  }
}
