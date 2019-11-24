package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationSequenceTest {

  PermutationSequence t = new PermutationSequence();

  @Test
  public void testGetPermutation() {
    assertEquals("213", t.getPermutation(3, 3));
  }

  @Test
  public void testGetPermutation2() {
    assertEquals("1", t.getPermutation(1, 1));
  }

  @Test
  public void testGetPermutation3() {
    assertEquals("3412", t.getPermutation(4, 17));
  }
}
