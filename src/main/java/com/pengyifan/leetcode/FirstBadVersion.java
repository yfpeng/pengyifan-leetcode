package com.pengyifan.leetcode;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check. Since each version is developed
 * based
 * on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 * causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to
 * the API.
 */
public class FirstBadVersion extends VersionControl {

  public FirstBadVersion(int firstBadVersion) {
    super(firstBadVersion);
  }

  public int firstBadVersion(int n) {
    int from = 1;
    int to = n;
    while (from < to) {
      int mid = from + (to - from) / 2;
      if (isBadVersion(mid)) {
        to = mid;
      } else {
        from = mid + 1;
      }
    }
    return isBadVersion(to) ? to : -1;
  }
}

abstract class VersionControl {
  public int firstBadVersion;

  public VersionControl(int firstBadVersion) {
    this.firstBadVersion = firstBadVersion;
  }

  boolean isBadVersion(int version) {
    return version >= firstBadVersion;
  }
}
