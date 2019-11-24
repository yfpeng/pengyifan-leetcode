package com.pengyifan.leetcode;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <pre>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheetColumnTitle {
  public String convertToTitle(int n) {
    String s = "";
    while (n > 0) {
      n--;
      char ch = (char) (n % 26 + 'A');
      n /= 26;
      s = ch + s;
    }
    return s;
  }
}
