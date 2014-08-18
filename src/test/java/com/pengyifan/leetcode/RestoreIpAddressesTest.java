package com.pengyifan.leetcode;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.Test;


public class RestoreIpAddressesTest {

  RestoreIpAddresses t = new RestoreIpAddresses();
  
  @Test
  public void test() {
    List<String> ips = t.restoreIpAddresses("25525511135");
    assertEquals(2, ips.size());
    assertThat(ips, hasItem("255.255.11.135"));
    assertThat(ips, hasItem("255.255.111.35"));
  }
  
  @Test
  public void test2() {
    List<String> ips = t.restoreIpAddresses("0000");
    assertEquals(1, ips.size());
    assertThat(ips, hasItem("0.0.0.0"));
  }

  @Test
  public void test3() {
    List<String> ips = t.restoreIpAddresses("010010");
    assertEquals(2, ips.size());
    assertThat(ips, hasItem("0.10.0.10"));
    assertThat(ips, hasItem("0.100.1.0"));
  }
  
  
  @Test
  public void test_null() {
    assertEquals(0, t.restoreIpAddresses(null).size());
    assertEquals(0, t.restoreIpAddresses("").size());
  }
}
