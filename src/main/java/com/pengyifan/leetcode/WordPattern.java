package com.pengyifan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a
 * non-empty word in str.
 * <p>
 * Examples:
 * <p>
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 * <p>
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters
 * separated by a single space.
 */
public class WordPattern {
  public boolean wordPattern(String pattern, String str) {
    String[] toks = str.split(" ");
    Map<Character, String> map1 = new HashMap<>();
    Map<String, Character> map2 = new HashMap<>();

    if (pattern.length() != toks.length) {
      return false;
    }

    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      if (map1.containsKey(c) && map2.containsKey(toks[i])) {
        if (!map1.get(c).equals(toks[i])) {
          return false;
        }
        if (!map2.get(toks[i]).equals(c)) {
          return false;
        }
      } else if (map1.containsKey(c)) {
        return false;
      } else if (map2.containsKey(toks[i])) {
        return false;
      } else {
        map1.put(c, toks[i]);
        map2.put(toks[i], c);
      }
    }
    return true;
  }
}
