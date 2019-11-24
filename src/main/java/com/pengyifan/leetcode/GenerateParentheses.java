package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 */
public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {
    if (n == 0) {
      return Collections.emptyList();
    }
    List<String> solutions = new ArrayList<String>();
    generateParenthesisHelper("", 0, 0, n, solutions);
    return solutions;
  }

  private void generateParenthesisHelper(String string, int left, int right,
      int n,
      List<String> solutions) {
    if (left > n) {
      return;
    }
    if (left == n && right == n) {
      solutions.add(string);
      return;
    }
    generateParenthesisHelper(string + "(", left + 1, right, n, solutions);
    if (left > right) {
      generateParenthesisHelper(string + ")", left, right + 1, n, solutions);
    }
  }

}
