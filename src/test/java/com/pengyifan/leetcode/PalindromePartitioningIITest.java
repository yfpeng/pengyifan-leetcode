package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromePartitioningIITest {

  PalindromePartitioningII s = new PalindromePartitioningII();
  
  @Test
  public void testMinCut() {
    assertEquals(1, s.minCut("aab"));
    assertEquals(2, s.minCut("leet"));
    assertEquals(1, s.minCut("ab"));
  }

}
