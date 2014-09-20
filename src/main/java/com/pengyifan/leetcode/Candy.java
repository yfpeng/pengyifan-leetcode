package com.pengyifan.leetcode;

import java.util.Arrays;

/**
 * There are N children standing in a line. Each child is assigned a rating
 * value.
 * <p>
 * You are giving candies to these children subjected to the following
 * requirements:
 * <ul>
 * <li>Each child must have at least one candy.
 * <li>Children with a higher rating get more candies than their neighbors.
 * </ul>
 * What is the minimum candies you must give?
 */
public class Candy {

  public int candy(int[] ratings) {

    int[] scanLeft = new int[ratings.length];
    Arrays.fill(scanLeft, 1);
    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1]) {
        scanLeft[i] = scanLeft[i - 1] + 1;
      }
    }

    int[] scanRight = new int[ratings.length];
    Arrays.fill(scanRight, 1);
    for (int i = ratings.length - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        scanRight[i] = scanRight[i + 1] + 1;
      }
    }
    int sum = 0;
    for (int i = 0; i < ratings.length; i++) {
      sum += Math.max(scanLeft[i], scanRight[i]);
    }
    return sum;
  }
}
