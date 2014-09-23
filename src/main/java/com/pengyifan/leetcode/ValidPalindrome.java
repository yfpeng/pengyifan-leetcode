package com.pengyifan.leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * 
 * <pre>
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * </pre>
 * 
 * Note:
 * <p>
 * Have you consider that the string might be empty? This is a good question to
 * ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }
    if (s.isEmpty() || s.length() == 1) {
      return true;
    }
    s = s.toLowerCase();
    // skip
    int p = moveRight(s, 0);
    int q = moveLeft(s, s.length() - 1);
    while (p < q) {
      if (s.charAt(p) != s.charAt(q)) {
        return false;
      }
      p++;
      q--;
      // skip
      p = moveRight(s, p);
      q = moveLeft(s, q);
    }
    return true;
  }

  private int moveRight(String s, int index) {
    while (index < s.length() && !isAlphaNumeric(s.charAt(index))) {
      index++;
    }
    return index;
  }

  private int moveLeft(String s, int index) {
    while (index >= 0 && !isAlphaNumeric(s.charAt(index))) {
      index--;
    }
    return index;
  }
  
  private boolean isAlphaNumeric(char c) {
    return Character.isAlphabetic(c) || Character.isDigit(c);
  }
}
