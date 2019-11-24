package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleNumber2Test {

  SingleNumber2 t = new SingleNumber2();

  @Test
  public void test() {
    assertEquals(5, t.singleNumber(new int[] { 1, 1, 5, 1 }));
  }

}
