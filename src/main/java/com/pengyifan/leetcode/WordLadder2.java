package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Given two words (start and end), and a dictionary, find the length of
 * shortest transformation sequence from start to end, such that:
 * <ul>
 * <li>Only one letter can be changed at a time
 * <li>Each intermediate word must exist in the dictionary
 * </ul>
 * For example,
 * <p>
 * Given:
 * 
 * <pre>
 * start = "hit" 
 * end = "cog" 
 * dict = ["hot","dot","dog","lot","log"]
 * </pre>
 * 
 * Returns
 * 
 * <pre>
 * [
 *     ["hit","hot","dot","dog","cog"],
 *     ["hit","hot","lot","log","cog"]
 * ]
 * </pre>
 * Note:
 * <ul>
 * <li>Return 0 if there is no such transformation sequence.
 * <li>All words have the same length.
 * <li>All words contain only lowercase alphabetic characters.
 * </ul>
 */
public class WordLadder2 {

  public List<List<String>> findLadders(String start, String end,
      Set<String> dict) {
    if (start == null || end == null) {
      return Collections.emptyList();
    }

    dict.add(start);
    dict.add(end);
    Map<String, Set<String>> neighbours = createNeighbours(dict);

    List<List<String>> solutions = new ArrayList<List<String>>();

    // BFS search queue
    Queue<Node> queue = new LinkedList<Node>();
    queue.offer(new Node(null, start, 1));

    // BFS level
    int previousLevel = 0;
    // mark which nodes have been visited, to break infinite loop
    Map<String, Integer> visited = new HashMap<String, Integer>();
    while (!queue.isEmpty()) {
      Node n = queue.poll();
      if (end.equals(n.str)) {
        // fine one path, check its length, if longer than previous path it's
        // valid
        // otherwise all possible short path have been found, should stop
        if (previousLevel == 0 || n.level == previousLevel) {
          previousLevel = n.level;
          findPath(n, solutions);
        } else {
          // all path with length *previousLevel* have been found
          break;
        }
      } else {
        Set<String> neighbour = neighbours.get(n.str);
        if (neighbour == null || neighbour.isEmpty()) {
          continue;
        }
        Set<String> toRemove = new HashSet<String>();
        for (String word : neighbour) {
          // if word has been visited before at a smaller level, there is
          // already
          // a shorter path from start to word thus we should ignore word so as
          // to
          // break infinite loop; if on the same level, we still need to put it
          // into queue.
          if (visited.containsKey(word)) {
            if (n.level + 1 > visited.get(word)) {
              neighbours.get(word).remove(n.str);
              toRemove.add(word);
              continue;
            }
          }
          visited.put(word, n.level + 1);
          queue.add(new Node(n, word, n.level + 1));
          neighbours.get(word).remove(n.str);
        }
        neighbour.removeAll(toRemove);
      }
    }

    return solutions;
  }

  private void findPath(Node n, List<List<String>> solution) {
    LinkedList<String> path = new LinkedList<String>();
    while (n != null) {
      path.addFirst(n.str);
      n = n.parent;
    }
    solution.add(path);
  }

  /**
   * complexity: O(26*str.length*dict.size)=O(L*N)
   */
  private Map<String, Set<String>> createNeighbours(Set<String> dict) {
    Map<String, Set<String>> neighbours = new HashMap<String, Set<String>>();
    for (String str : dict) {
      char[] chars = str.toCharArray();
      for (int i = 0; i < str.length(); i++) {
        char old = chars[i];
        for (char c = 'a'; c <= 'z'; c++) {
          if (c == old) {
            continue;
          }
          chars[i] = c;
          String newstr = new String(chars);
          if (dict.contains(newstr)) {
            Set<String> set = neighbours.get(str);
            if (set == null) {
              set = new HashSet<String>();
              neighbours.put(str, set);
            }
            set.add(newstr);
          }
        }
        chars[i] = old;
      }
    }
    return neighbours;
  }

  private class Node {

    Node parent;
    String str;
    int level;

    public Node(Node parent, String str, int level) {
      this.parent = parent;
      this.str = str;
      this.level = level;
    }
  }
}
