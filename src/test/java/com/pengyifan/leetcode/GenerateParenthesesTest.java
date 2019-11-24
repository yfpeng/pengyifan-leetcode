package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class GenerateParenthesesTest {
  
  GenerateParentheses s = new GenerateParentheses();

  @Test
  public void testGenerateParenthesis() {
    List<String> solutions = s.generateParenthesis(3);
    assertEquals(5, solutions.size());
    assertTrue(solutions.contains("()()()"));
    assertTrue(solutions.contains("()(())"));
    assertTrue(solutions.contains("(())()"));
    assertTrue(solutions.contains("((()))"));
    assertTrue(solutions.contains("(()())"));
  }

}
