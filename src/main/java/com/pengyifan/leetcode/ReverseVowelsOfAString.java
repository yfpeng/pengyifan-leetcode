package com.pengyifan.leetcode;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * <p>
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * <p>
 * Given s = "leetcode", return "leotcede".
 */
public class ReverseVowelsOfAString {
  public String reverseVowels(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    char [] cs = s.toCharArray();
    int i = 0;
    int j = cs.length - 1;
    while (i < j) {
      while (i < cs.length && !isVowel(cs[i])) {
        i ++;
      }
      while (j >= 0 && !isVowel(cs[j])) {
        j--;
      }
      if (i < j) {
        swap(cs, i, j);
        i ++;
        j --;
      }
    }
    return new String(cs);
  }

  private boolean isVowel(char c) {
    return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'
        || c == 'A' || c == 'E' ||c == 'I' ||c == 'O' ||c == 'U';
  }

  private void swap (char [] cs, int i, int j) {
    char c = cs[i];
    cs[i] = cs[j];
    cs[j] = c;
  }
}
