package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GasStationTest {

  GasStation t = new GasStation();

  @Test
  public void test() {
    assertEquals(0, t.canCompleteCircuit(new int[] { 5 }, new int[] { 4 }));
  }

  @Test
  public void test2() {
    assertEquals(
        1,
        t.canCompleteCircuit(new int[] { 1, 2 }, new int[] { 2, 1 }));
  }
}
