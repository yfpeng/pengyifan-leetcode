package com.pengyifan.leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all
 * valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

  public boolean isValid(String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }
    Stack<Character> stack = new Stack<Character>();
    stack.push(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
      case '(':
      case '{':
      case '[':
        stack.push(c);
        break;
      case ')':
      case '}':
      case ']':
        if (stack.isEmpty()) {
          return false;
        }
        char pop = stack.pop();
        if (pop == '(' && c != ')') {
          return false;
        }
        if (pop == '{' && c != '}') {
          return false;
        }
        if (pop == '[' && c != ']') {
          return false;
        }
        break;
      default:
        return false;
      }
    }
    return stack.isEmpty();
  }
}
