package com.pengyifan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order
 * of characters. No two characters may map to the same character but a character may map to
 * itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 * <p>
 * Given "paper", "title", return true.
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 */
public class IsomorphicStrings {
  public boolean isIsomorphic(String s, String t) {
    if (s == null || t == null || s.length() != t.length()) {
      return false;
    }
    Map<Character, Character> map1 = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (map1.containsKey(s.charAt(i))) {
        if (t.charAt(i) != map1.get(s.charAt(i))) {
          return false;
        }
      } else if (map2.containsKey(t.charAt(i))) {
        return false;
      } else {
        map1.put(s.charAt(i), t.charAt(i));
        map2.put(t.charAt(i), s.charAt(i));
      }
    }
    return true;
  }
}
