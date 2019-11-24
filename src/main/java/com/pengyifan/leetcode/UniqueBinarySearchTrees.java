package com.pengyifan.leetcode;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store
 * values 1...n?
 * <p>
 * For example,
 * <p>
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 * <pre>
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * </pre>
 */
public class UniqueBinarySearchTrees {

  public int numTrees(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    if (n < 0) {
      return -1;
    }
    int[] result = new int[n + 1];
    result[0] = 1;
    result[1] = 1;

    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        result[i] += result[j] * result[i - j - 1];
      }
    }
    return result[n];
  }
}
