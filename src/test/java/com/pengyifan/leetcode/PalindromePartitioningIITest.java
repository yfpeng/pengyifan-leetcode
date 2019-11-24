package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Given a string s, partition s such that every substring of the partition is
 * a palindrome.
 * <p>
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * <p>
 * For example, given s = "aab", Return 1 since the palindrome partitioning
 * ["aa","b"] could be produced using 1 cut.
 */
public class PalindromePartitioningIITest {

  PalindromePartitioningII s = new PalindromePartitioningII();

  @Test
  public void testMinCut() {
    assertEquals(1, s.minCut("aab"));
    assertEquals(2, s.minCut("leet"));
    assertEquals(1, s.minCut("ab"));
  }

}
