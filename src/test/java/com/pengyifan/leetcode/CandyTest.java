package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class CandyTest {
  
  Candy candy = new Candy();

  @Test
  public void testCandy() {
    assertEquals(6, candy.candy(new int[]{5,3,1}));
  }

  @Test
  public void testCandy2() {
    int[] ratings = new int[20000];
    int sum = 0;
    for(int i=0;i<ratings.length;i++) {
      ratings[i] = i+1;
      sum += ratings[i];
    }
    assertEquals(sum, candy.candy(ratings));
  }
}
