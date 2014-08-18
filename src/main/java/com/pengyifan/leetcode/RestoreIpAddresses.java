package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 */
public class RestoreIpAddresses {

  public List<String> restoreIpAddresses(String s) {
    if (s == null || s.length() < 4) {
      return Collections.emptyList();
    }
    List<String> ips = new ArrayList<String>();
    restoreIpAddressesHelper(s, 0, 1, 1, ips);
    restoreIpAddressesHelper(s, 0, 2, 1, ips);
    restoreIpAddressesHelper(s, 0, 3, 1, ips);
    return ips;
  }

  private void restoreIpAddressesHelper(String s,
      int start,
      int end,
      int level,
      List<String> ips) {
    if (end > s.length()) {
      return;
    }
    if (level > 4) {
      return;
    }
    if (end - start >= 2 && s.charAt(start) == '0') {
      return;
    }
    int i = Integer.parseInt(s.substring(start, end));
    if (i <= 255) {
      if (level == 4 && end == s.length()) {
        ips.add(s);
        return;
      }
      s = s.substring(0, end) + "." + s.substring(end);
      restoreIpAddressesHelper(s, end + 1, end + 2, level + 1, ips);
      restoreIpAddressesHelper(s, end + 1, end + 3, level + 1, ips);
      restoreIpAddressesHelper(s, end + 1, end + 4, level + 1, ips);
    }
    return;
  }

}
