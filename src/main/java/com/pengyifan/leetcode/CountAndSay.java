package com.pengyifan.leetcode;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * <p>
 * 11 is read off as "two 1s" or 21.
 * <p>
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth sequence.
 * <p>
 * Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
  public String countAndSay(int n) {
    String s = "1";
    for (int i = 0; i < n - 1; i++) {
      s = countAndSayHelper(s);
    }
    return s;
  }

  private String countAndSayHelper(String s) {
    String o = "";
    char c = s.charAt(0);
    int n = 0;
    int i = 0;
    while (i < s.length()) {
      if (s.charAt(i) == c) {
        n++;
        i++;
      } else {
        o += Integer.toString(n) + c;
        c = s.charAt(i);
        n = 0;
      }
    }
    o += Integer.toString(n) + c;
    return o;
  }
}
