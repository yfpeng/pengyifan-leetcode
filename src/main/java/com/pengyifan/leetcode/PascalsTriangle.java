package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalsTriangle {

  public List<List<Integer>> generate(int numRows) {
    if (numRows <= 0) {
      return Collections.emptyList();
    }
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    List<Integer> lastList = null;
    if (numRows >= 1) {
      List<Integer> list = new ArrayList<Integer>();
      lists.add(list);
      lastList = list;
      list.add(1);
    }
    if (numRows >= 2) {
      List<Integer> list = new ArrayList<Integer>();
      lists.add(list);
      lastList = list;
      list.add(1);
      list.add(1);
    }
    for (int i = 2; i < numRows; i++) {
      List<Integer> list = new ArrayList<Integer>();
      lists.add(list);
      // first
      list.add(1);
      for (int j = 1; j < i; j++) {
        list.add(lastList.get(j - 1) + lastList.get(j));
      }
      // last
      list.add(1);
      lastList = list;
    }
    return lists;
  }
}
