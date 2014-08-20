package com.pengyifan.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * <p>
 * For example, given k = 3, Return [1,3,3,1].
 * <p>
 * Note: Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalsTriangle2 {

  public List<Integer> getRow(int rowIndex) {
    if (rowIndex < 0) {
      throw new IllegalArgumentException();
    } else if (rowIndex == 0) {
      return Arrays.asList(1);
    } else if (rowIndex == 1) {
      return Arrays.asList(1, 1);
    } else {
      Integer[] a = new Integer[rowIndex + 1];
      a[0] = 1;
      a[1] = 1;
      for (int i = 2; i <= rowIndex; i++) {
        a[i] = 1;
        for (int j = i - 1; j > 0; j--) {
          a[j] = a[j] + a[j - 1];
        }
      }
      return Arrays.asList(a);
    }
  }
}
