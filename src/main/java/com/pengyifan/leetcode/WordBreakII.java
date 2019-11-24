package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Given a string s and a dictionary of words dict, add spaces in s to
 * construct a sentence where each word is a valid dictionary word.
 * <p>
 * Return all such possible sentences.
 * <p>
 * For example, given
 * 
 * <pre>
 * s = "catsanddog", 
 * dict = ["cat", "cats", "and", "sand", "dog"].
 * </pre>
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {

  public List<String> wordBreak(String s, Set<String> dict) {
    if (s == null || s.isEmpty()) {
      return Collections.emptyList();
    }
    List<String> solutions = new ArrayList<String>();
    wordBreakHelper(
        s,
        dict,
        solutions,
        0,
        new LinkedList<Integer>(),
        new boolean[s.length() + 1]);
    return solutions;
  }

  private void wordBreakHelper(String s, Set<String> dict,
      List<String> solutions, int startIndex, LinkedList<Integer> indices,
      boolean[] isFailedAt) {
    if (startIndex == s.length()) {
      solutions.add(createString(s, indices));
    }
    for (int endIndex = startIndex + 1; endIndex <= s.length(); endIndex++) {
      if (isFailedAt[endIndex]) {
        continue;
      }
      String word = s.substring(startIndex, endIndex);
      if (dict.contains(word)) {
        indices.add(endIndex);
        int previousSize = solutions.size();
        wordBreakHelper(s, dict, solutions, endIndex, indices, isFailedAt);
        if (previousSize == solutions.size()) {
          isFailedAt[endIndex] = true;
        }
        indices.removeLast();
      }
    }
  }

  private String createString(String s, LinkedList<Integer> indices) {
    StringBuilder sb = new StringBuilder();
    int startIndex = 0;
    for (int endIndex : indices) {
      sb.append(s.substring(startIndex, endIndex)).append(' ');
      startIndex = endIndex;
    }
    return sb.substring(0, sb.length() - 1);
  }
}
