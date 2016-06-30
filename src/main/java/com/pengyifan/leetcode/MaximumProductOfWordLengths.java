package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the
 * two words do not share common letters. You may assume that each word will contain only lower case
 * letters. If no such two words exist, return 0.
 * <p>
 * Example 1:
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * <p>
 * Example 2:
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * <p>
 * Example 3:
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 */
public class MaximumProductOfWordLengths {
  public int maxProduct(String[] words) {
    int m = 0;
    Arrays.sort(words, (s, t) -> -Integer.compare(s.length(), t.length()));
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (words[i].length() * words[j].length() < m) {
          break;
        }
        if (!isSame(words[i], words[j])) {
          m = Math.max(m, words[i].length() * words[j].length());
          break;
        }
      }
    }
    return m;
  }

  private boolean isSame(String word1, String word2) {
    boolean bs[] = new boolean[26];
    for (char c : word1.toCharArray()) {
      bs[c - 'a'] = true;
    }
    for (char c : word2.toCharArray()) {
      if (bs[c - 'a']) {
        return true;
      }
    }
    return false;
  }
}
