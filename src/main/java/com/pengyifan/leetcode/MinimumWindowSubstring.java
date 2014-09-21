package com.pengyifan.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

  public String minWindow(String S, String T) {
    if (S == null || T == null) {
      return null;
    }
    if (S.isEmpty() || T.isEmpty()) {
      return "";
    }
    
    // T may have duplicated chars
    Counter tCounter = new Counter();
    for (char c : T.toCharArray()) {
      tCounter.add(c);
    }

    Counter sCounter = new Counter();
    int totalCount = 0;

    int minStartIndex = -1;
    int minEndIndex = S.length();

    int startIndex = 0;
    int endIndex = 0;
    while (endIndex < S.length()) {
      char c = S.charAt(endIndex);
      if (tCounter.has(c)) {
        sCounter.add(c);
        totalCount++;
        if (sCounter.count(c) > tCounter.count(c)) {
          totalCount--;
        }
        // S[startIndex .. endIndex] covers T
        if (totalCount == T.length()) {
          // move startIndex right to find the min coverage
          while (startIndex < endIndex) {
            c = S.charAt(startIndex);
            if (!tCounter.has(c)) {
              startIndex++;
            } else if (sCounter.count(c) > tCounter.count(c)) {
              sCounter.remove(c);
              startIndex++;
            } else {
              break;
            }
          }
          if (minEndIndex - minStartIndex > endIndex - startIndex) {
            minStartIndex = startIndex;
            minEndIndex = endIndex;
          }
        }
      }
      endIndex++;
    }
    if (minStartIndex == -1) {
      return "";
    } else {
      return S.substring(minStartIndex, minEndIndex + 1);
    }
  }

  private class Counter {

    Map<Character, Integer> map = new HashMap<Character, Integer>();

    public void add(Character c) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    
    public void remove(Character c) {
      if (map.containsKey(c)) {
      map.put(c, map.get(c) - 1);
      }
    }
    
    public int count(Character c) {
      return map.get(c);
    }
    
    public boolean has(Character c) {
      return map.containsKey(c);
    }
  }
}
