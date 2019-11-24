package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

  BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();

  @Test
  public void testMaxProfit() {
    assertEquals(0, s.maxProfit(new int[] { 2, 1 }));
  }

}
