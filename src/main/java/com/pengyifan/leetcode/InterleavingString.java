package com.pengyifan.leetcode;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and
 * s2.
 */
public class InterleavingString {

  public boolean isInterleave(String s1, String s2, String s3) {
    if (s1 == null || s2 == null || s3 == null) {
      return false;
    }
    if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
      return true;
    }
    if (s1.isEmpty()) {
      return s2.equals(s3);
    }
    if (s2.isEmpty()) {
      return s1.equals(s3);
    }
    if (s1.length() + s2.length() != s3.length()) {
      return false;
    }
    boolean[][] t = new boolean[s1.length() + 1][s2.length() + 1];
    t[0][0] = true;
    for (int i = 0; i <= s1.length(); i++) {
      for (int j = 0; j <= s2.length(); j++) {
        if (i > 0) {
          t[i][j] = (t[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
        }
        if (j > 0) {
          t[i][j] |= (t[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
        }
      }
    }
    return t[s1.length()][s2.length()]
        | t[s1.length() - 1][s2.length()]
        | t[s1.length()][s2.length() - 1];
  }
}
