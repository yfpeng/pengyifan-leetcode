package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * <p>
 * Note:
 * <ul>
 * <li>You may assume k is always valid, 1 ≤ k ≤ number of unique elements.</li>
 * <li>Your algorithm's time complexity must be better than O(n log n), where n is the array's size.</li>
 * </ul>
 */
public class TopKFrequentElements {
  public List<Integer> topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int i : nums) {
      m.put(i, m.getOrDefault(i, 0) + 1);
    }
    List<Map.Entry<Integer, Integer>> l = m.entrySet().stream()
        .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
        .collect(Collectors.toList());
    List<Integer> rst = new ArrayList<>();
    for (int i = 0; i < k && i < l.size(); i++) {
      rst.add(l.get(i).getKey());
    }
    return rst;
  }
}
