package com.pengyifan.leetcode;

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest
 * palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * <pre>
 * Input:
 * "abccccdd"
 *
 * Output:
 * 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * </pre>
 */
public class LongestPalindrome {
  public int longestPalindrome(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    int[] count = new int[256];
    for (char c : s.toCharArray()) {
      count[c]++;
    }
    boolean hasOdd = false;
    int longest = 0;
    for (int c : count) {
      if (c % 2 == 0) {
        longest += c;
      } else {
        longest += c - 1;
        hasOdd = true;
      }
    }
    return longest + (hasOdd ? 1 : 0);
  }
}
