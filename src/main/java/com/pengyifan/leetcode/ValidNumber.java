package com.pengyifan.leetcode;

/**
 * Validate if a given string is numeric.
 * <p>
 * Some examples:
 * 
 * <pre>
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * </pre>
 * 
 * Note: It is intended for the problem statement to be ambiguous. You should
 * gather all requirements up front before implementing one.
 */
public class ValidNumber {

  /**
   * <pre>
   * space
   *  ( )  +/-       0-9
   *   0 -------> 1 -----> 2
   *   |          |   .
   *   |          +------> 8
   *   |      0-9             space
   *   +-----------------> 2 -------> 4         0-9
   *   |                   |   e/E        0-9   ( )  space
   *   |                   + --------> 6 ------> 7 --------> 4
   *   |                   |          ^ |        ^
   *   |                   |          | | +/-    | 0-9
   *   |                   | .        | + -----> 10
   *   |                   |      e/E |          
   *   |                   |          |
   *   |             0-9   |          |   space
   *   +-------> 8 --------+ -------> 3 --------> 4
   *                                 ( )
   *                                 0-9
   * </pre>
   */
  public boolean isNumber(String s) {
    if (s == null || s.isEmpty()) {
      return false;
    }

    int state = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (state) {
      case 0:
        if (c == ' ') {
          ;
        } else if (c == '+' || c == '-') {
          state = 1;
        } else if (Character.isDigit(c)) {
          state = 2;
        } else if (c == '.') {
          state = 8;
        } else {
          return false;
        }
        break;
      case 1:
        if (Character.isDigit(c)) {
          state = 2;
        } else if (c == '.') {
          state = 8;
        } else {
          return false;
        }
        break;
      case 2:
        if (Character.isDigit(c)) {
          ;
        } else if (c == '.') {
          state = 3;
        } else if (c == ' ') {
          state = 4;
        } else if (c == 'e' || c == 'E') {
          state = 6;
        } else {
          return false;
        }
        break;
      case 3:
        if (Character.isDigit(c)) {
          ;
        } else if (c == ' ') {
          state = 4;
        } else if (c == 'e' || c == 'E') {
          state = 6;
        } else {
          return false;
        }
        break;
      case 4:
        if (c == ' ') {
          ;
        } else {
          return false;
        }
        break;
      case 6:
        if (Character.isDigit(c)) {
          state = 7;
        } else if (c == '+' || c == '-') {
          state = 10;
        } else {
          return false;
        }
        break;
      case 7:
        if (Character.isDigit(c)) {
          ;
        } else if (c == ' ') {
          state = 4;
        } else {
          return false;
        }
        break;
      case 8:
        if (Character.isDigit(c)) {
          state = 3;
        } else {
          return false;
        }
        break;
      case 10:
        if (Character.isDigit(c)) {
          state = 7;
        } else {
          return false;
        }
        break;
      default:
        throw new IllegalStateException();
      }
    }
    return state == 2 || state == 3 || state == 4 || state == 5 || state == 7;
  }
}
