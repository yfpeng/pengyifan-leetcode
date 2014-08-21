package com.pengyifan.leetcode;

import java.util.HashMap;

/**
 * Implement pow(x, n).
 */
public class PowXN {

  public double pow(double x, int n) {
    if (n == 0) {
      return 1;
    } else if (n > 0) {
      return pow(x, n, new HashMap<Integer, Double>());
    } else {
      return 1 / pow(x, -n, new HashMap<Integer, Double>());
    }
  }

  private double pow(double x, int n, HashMap<Integer, Double> cache) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    double p;
    if (n % 2 == 0) {
      p = pow(x, n / 2, cache) * pow(x, n / 2, cache);
    } else {
      p = pow(x, n / 2, cache) * pow(x, n / 2 + 1, cache);
    }
    cache.put(n, p);
    return p;
  }
}
