package com.pengyifan.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;


public class SimplifyPathTest {

  SimplifyPath s = new SimplifyPath();
  
  @Test
  public void testSimplifyPath() {
    assertEquals("/home", s.simplifyPath("/home/"));
    assertEquals("/c", s.simplifyPath("/a/./b/../../c/"));
    assertEquals("/", s.simplifyPath("/../"));
    assertEquals("/home/foo", s.simplifyPath("/home//foo/"));
    assertEquals("/", s.simplifyPath("/."));
  }

}
