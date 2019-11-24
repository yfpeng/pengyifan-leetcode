package com.pengyifan.leetcode;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class WordBreakIITest {

  WordBreakII wordBreak = new WordBreakII();

  @Test
  public void testWordBreak() {
    String s = "catsanddog";
    String[] dictWords = new String[] { "cat", "cats", "and", "sand", "dog" };
    Set<String> dict = new HashSet<String>();
    for (String w : dictWords) {
      dict.add(w);
    }
    List<String> solutions = wordBreak.wordBreak(s, dict);
    assertThat(solutions, hasItem("cats and dog"));
    assertThat(solutions, hasItem("cat sand dog"));
  }

  @Test
  public void testWordBreak2() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
        + "aaaaaaaaaaaaaaaaaaaaab";
    String[] dictWords = new String[] { "a", "aa", "aaa", "aaaa", "aaaaa",
        "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa" };
    Set<String> dict = new HashSet<String>();
    for (String w : dictWords) {
      dict.add(w);
    }
    List<String> solutions = wordBreak.wordBreak(s, dict);
    assertTrue(solutions.isEmpty());
  }
}
