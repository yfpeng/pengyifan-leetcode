package com.pengyifan.leetcode;

import java.util.Arrays;

public class PalindromePartitioningII {

  public int minCut(String s) {
    if (s == null || s.isEmpty() || s.length() == 1) {
      return 0;
    }

    // t[i][j] = true iff s[i:j] is palindrome
    boolean[][] palindromeTable = new boolean[s.length()][s.length()];
    for (int j = 0; j < s.length(); j++) {
      palindromeTable[j][j] = true;
      for (int i = j - 1; i >= 0; i--) {
        if (s.charAt(i) == s.charAt(j)) {
          if (i == j - 1) {
            palindromeTable[i][j] = true;
          } else {
            palindromeTable[i][j] = palindromeTable[i + 1][j - 1];
          }
        } else {
          palindromeTable[i][j] = false;
        }
      }
    }

    int[] minCuts = new int[s.length()];
    Arrays.fill(minCuts, 0);
    for (int i = 0; i < s.length(); i++) {
      if (palindromeTable[0][i]) {
        minCuts[i] = 0;
      } else {
        int minCut = i;
        for (int j = 0; j < i; j++) {
          if (palindromeTable[j + 1][i]) {
            if (minCut > minCuts[j] + 1) {
              minCut = minCuts[j] + 1;
            }
          }
        }
        minCuts[i] = minCut;
      }
    }
    return minCuts[s.length()-1];
  }
}
