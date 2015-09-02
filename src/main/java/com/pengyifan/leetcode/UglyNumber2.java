package com.pengyifan.leetcode;

import java.util.LinkedList;

/**
 * Write a program to find the n-th ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2,
 * 3,
 * 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * <p>
 * Note that 1 is typically treated as an ugly number.
 * <p>
 * Hint:
 * <p>
 * <ul>
 * <li>The naive approach is to call isUgly for every number until you reach the nth one. Most
 * numbers
 * are not ugly. Try to focus your effort on generating only the ugly ones.</li>
 * <li>An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.</li>
 * <li>The key is how to maintain the order of the ugly numbers. Try a similar approach of merging
 * from
 * three sorted lists: L1, L2, and L3.</li>
 * <li>Assume you have Uk, the kth ugly number. Then Uk+1 must be Min(L1 * 2, L2 * 3, L3 * 5).</li>
 * </ul>
 */
public class UglyNumber2 {
  public int nthUglyNumber(int n) {
    if (n == 1) {
      return 1;
    }

    int[] primes = {2, 3, 5};
    LinkedList<Integer>[] list = new LinkedList[primes.length];
    for (int i = 0; i < primes.length; i++) {
      list[i] = new LinkedList<>();
      list[i].add(1);
    }

    int ugly = 1;
    for (int i = 2; i <= n; i++) {
      int min = primes[0] * list[0].getFirst();
      for (int j = 1; j < primes.length; j++) {
        if (min > primes[j] * list[j].getFirst()) {
          min = primes[j] * list[j].getFirst();
        }
      }
      ugly = min;
      for (int j = 0; j < primes.length; j++) {
        list[j].add(ugly);
        if (primes[j] * list[j].getFirst() == ugly) {
          list[j].removeFirst();
        }
      }
    }
    return ugly;
  }
}
