package com.pengyifan.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * <p>
 * For example, Given s = "Hello World", return 5.
 */
public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    int length = 0;
    int lastLength = 0;
    int state = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (state) {
      case 0:
        if (c == ' ') {
          ;
        } else {
          state = 1;
          length = 1;
        }
        break;
      case 1:
        if (c == ' ') {
          lastLength = length;
          length = 0;
          state = 0;
        } else {
          length++;
        }
      }
    }
    if (length != 0) {
      return length;
    } else {
      return lastLength;
    }
  }
}
