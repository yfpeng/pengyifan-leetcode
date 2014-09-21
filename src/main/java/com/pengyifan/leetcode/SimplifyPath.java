package com.pengyifan.leetcode;

import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * 
 * <pre>
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * </pre>
 * 
 * Corner Cases:
 * <ul>
 * <li>Did you consider the case where <code>path = "/../"</code>? In this
 * case, you should return "/".
 * <li>Another corner case is the path might contain multiple slashes
 * <code>'/'</code> together, such as <code>"/home//foo/"</code>. In this case,
 * you should ignore redundant slashes and return <code>"/home/foo"</code>.
 * </ul>
 */
public class SimplifyPath {

  /**
   * <pre>
   *            '/'         letter              '/'
   *      '/'   ( )  letter  ( )   '/'(action)  ( )  (action)
   *   0 ------> 1 ---------> 2 ---------------> 3 -----------> end
   *   |         ^                              |
   *   |         |            letter            |
   *   v         +------------------------------+
   * error
   * </pre>
   */
  public String simplifyPath(String path) {
    if (path == null || path.isEmpty()) {
      return path;
    }
    Stack<String> folders = new Stack<String>();
    int state = 0;

    int beginIndex = -1;
    for (int i = 0; i < path.length(); i++) {
      char c = path.charAt(i);
      switch (state) {
      case 0:
        if (c == '/') {
          state = 1;
        } else {
          throw new IllegalArgumentException();
        }
        break;
      case 1:
        if (c == '/') {
          ;
        } else {
          state = 2;
          beginIndex = i;
        }
        break;
      case 2:
        if (c == '/') {
          state = 3;
          action(folders, path, beginIndex, i);
          beginIndex = -1;
        } else {
          ;
        }
        break;
      case 3:
        if (c == '/') {
          ;
        } else {
          state = 2;
          beginIndex = i;
        }
        break;
      default:
        throw new IllegalArgumentException();
      }
    }
    if (beginIndex != -1) {
      action(folders, path, beginIndex, path.length());
    }

    return createPath(folders);
  }

  private void action(Stack<String> folders, String path, int beginIndex,
      int endIndex) {
    String folder = path.substring(beginIndex, endIndex);
    if (folder.equals(".")) {
      ;
    } else if (folder.equals("..")) {
      if (!folders.isEmpty()) {
        folders.pop();
      }
    } else {
      folders.push(folder);
    }
  }

  private String createPath(Stack<String> folders) {
    StringBuilder sb = new StringBuilder();
    for (String s : folders) {
      sb.append('/').append(s);
    }
    if (sb.length() == 0) {
      return "/";
    } else {
      return sb.toString();
    }
  }
}
