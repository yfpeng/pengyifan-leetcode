package com.pengyifan.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class QueueReconstructionByHeightTest {

  private QueueReconstructionByHeight t = new QueueReconstructionByHeight();

  @Test
  public void testReconstructQueue() throws Exception {
    int[][] people = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
    people = t.reconstructQueue(people);
    assertEquals(5, people[0][0]);
    assertEquals(7, people[5][0]);
  }

  @Test
  public void testReconstructQueue2() throws Exception {
    int[][] people = new int[][]{{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};
    people = t.reconstructQueue(people);
    assertEquals(1, people[0][0]);
    // assertEquals(7, people[5][0]);
  }
}