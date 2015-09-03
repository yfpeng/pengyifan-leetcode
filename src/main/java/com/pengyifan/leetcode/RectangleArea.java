package com.pengyifan.leetcode;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * <p>
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */
public class RectangleArea {
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int a1 = area(C - A, D - B);
    int a2 = area(G - E, H - F);
    int intersection = getIntersection(A, B, C, D, E, F, G, H);
    return a1 + a2 - intersection;
  }

  private int getIntersection(int a, int b, int c, int d, int e, int f, int g, int h) {
    int width = 0;
    if (isIntersected(a, c, e, g)) {
      width = Math.min(c, g) - Math.max(a, e);
    }
    int height = 0;
    if (isIntersected(b, d, f, h)) {
      height = Math.min(d, h) - Math.max(b, f);
    }
    return area(width, height);
  }

  private boolean isIntersected(int a, int b, int c, int d) {
    return (a <= c && c <= b) || (a <= d && d <= b)
        || (c <= a && a <= d) || (c <= b && b <= d);
  }

  private int area(int width, int height) {
    return width * height;
  }
}
