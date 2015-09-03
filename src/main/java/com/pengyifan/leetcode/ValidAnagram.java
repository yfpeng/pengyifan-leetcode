package com.pengyifan.leetcode;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * <p>
 * s = "anagram", t = "nagaram", return true.
 * <p>
 * s = "rat", t = "car", return false.
 */
public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s == null && t == null) {
      return true;
    }
    if (s == null || t == null) {
      return false;
    }
    int[] alphabet = new int[26];
    for (char c : s.toCharArray()) {
      alphabet[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
      alphabet[c - 'a']--;
    }
    for (int i : alphabet) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }
}
