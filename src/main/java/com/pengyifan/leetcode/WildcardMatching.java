package com.pengyifan.leetcode;

/**
 * '?' Matches any single character.
 * <p>
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * Some examples:
 * 
 * <pre>
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 * </pre>
 */
public class WildcardMatching {

  public boolean isMatch(String s, String p) {
    if (s == null || p == null) {
      return false;
    }

    int starIndex = -1;
    int ssIndex = 0;
    int sIndex = 0;
    int pIndex = 0;

    while (sIndex < s.length()) {
      if (pIndex < p.length()
          && (p.charAt(pIndex) == '?'
          || p.charAt(pIndex) == s.charAt(sIndex))) {
        sIndex++;
        pIndex++;
      } else if (pIndex < p.length() && p.charAt(pIndex) == '*') {
        starIndex = pIndex;
        pIndex++;
        ssIndex = sIndex;
      } else if (starIndex != -1) {
        pIndex = starIndex + 1;
        ssIndex++;
        sIndex = ssIndex;
      } else {
        return false;
      }
    }
    while (pIndex < p.length() && p.charAt(pIndex) == '*') {
      pIndex++;
    }

    return pIndex == p.length();
  }
}
