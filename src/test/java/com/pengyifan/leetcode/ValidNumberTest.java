package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class ValidNumberTest {
  
  ValidNumber s = new ValidNumber();

  @Test
  public void testIsNumber() {
    assertTrue(s.isNumber("0"));
    assertTrue(s.isNumber(" 0.1 "));
    assertTrue(s.isNumber("2e10"));
    assertTrue(s.isNumber("1 "));
    assertTrue(s.isNumber(".1"));
    assertTrue(s.isNumber("01"));
    assertTrue(s.isNumber("2e0"));
    assertTrue(s.isNumber("+.8"));
    assertTrue(s.isNumber("46.e3"));
    assertTrue(s.isNumber(" 005047e+6"));
    assertTrue(s.isNumber("013455.e1 "));
    
    assertFalse(s.isNumber("abc"));
    assertFalse(s.isNumber("1 a"));
    assertFalse(s.isNumber("."));
    assertFalse(s.isNumber(". "));
    assertFalse(s.isNumber("-7e"));
    assertFalse(s.isNumber("92e1740e91"));
    assertFalse(s.isNumber("4e+"));
  }

}
