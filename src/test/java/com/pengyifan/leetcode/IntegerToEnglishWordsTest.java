package com.pengyifan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToEnglishWordsTest {

  IntegerToEnglishWords t = new IntegerToEnglishWords();

  @Test
  public void testNumberToWords() throws Exception {
    assertEquals("One Hundred", t.numberToWords(100));
    assertEquals("One Hundred Twenty Three", t.numberToWords(123));
    assertEquals("Twelve Thousand Three Hundred Forty Five", t.numberToWords(12345));
    assertEquals("One Hundred Thousand", t.numberToWords(100000));
    assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", t.numberToWords(1234567));
    assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", t.numberToWords(1234567891));
  }
}