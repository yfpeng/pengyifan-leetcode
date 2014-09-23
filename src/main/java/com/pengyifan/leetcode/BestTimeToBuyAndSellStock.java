package com.pengyifan.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 */
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0 || prices.length == 1) {
      return 0;
    }
    int[] mins = new int[prices.length];

    mins[0] = prices[0];
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      }
      mins[i] = min;
    }
    int max = 0;
    for (int i = 0; i < prices.length; i++) {
      if (max < prices[i] - mins[i]) {
        max = prices[i] - mins[i];
      }
    }
    return max;
  }
}
