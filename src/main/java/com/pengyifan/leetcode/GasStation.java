package com.pengyifan.leetcode;

/**
 * There are N gas stations along a circular route, where the amount of gas at
 * station i is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from station i to its next station (i+1). You begin the journey with
 * an empty tank at one of the gas stations.
 * <p>
 * Return the starting gas station's index if you can travel around the circuit
 * once, otherwise return -1.
 */
public class GasStation {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    if (gas == null
        || cost == null
        || gas.length == 0
        || cost.length == 0
        || gas.length != cost.length) {
      return -1;
    }
    int length = gas.length;
    gas = doubleArray(gas);
    cost = doubleArray(cost);

    int start = 0;
    int tank = 0;

    for (int end = 1; end < gas.length; end++) {
      tank += gas[end - 1] - cost[end - 1];
      if (tank < 0) {
        start = end;
        tank = 0;
      }
      if (end - start == length) {
        return start;
      }
    }

    return -1;
  }

  private int[] doubleArray(int[] array) {
    int[] results = new int[array.length + array.length];
    System.arraycopy(array, 0, results, 0, array.length);
    System.arraycopy(array, 0, results, array.length, array.length);
    return results;
  }
}
