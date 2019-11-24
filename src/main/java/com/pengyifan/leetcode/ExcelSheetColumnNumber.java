package com.pengyifan.leetcode;

/**
 * Related to question Excel Sheet Column Title
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <pre>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * </pre>
 */
public class ExcelSheetColumnNumber {
  public int titleToNumber(String s) {
    if (s == null && s.length() == 0) {
      return 0;
    }
    int i = 0;
    for (char c : s.toCharArray()) {
      int n = c - 'A' + 1;
      i = i * 26 + n;
    }
    return i;
  }
}
