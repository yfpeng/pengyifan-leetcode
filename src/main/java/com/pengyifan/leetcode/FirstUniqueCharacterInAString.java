package com.pengyifan.leetcode;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't
 * exist, return -1.
 * <p>
 * Examples:
 * <pre>
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * </pre>
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {
  public int firstUniqChar(String s) {
    if (s == null) {
      return -1;
    }
    int[] count = new int[256];
    for (char c : s.toCharArray()) {
      count[c]++;
    }
    for (int i = 0; i < s.length(); i++) {
      if (count[s.charAt(i)] < 2) {
        return i;
      }
    }
    return -1;
  }
}
