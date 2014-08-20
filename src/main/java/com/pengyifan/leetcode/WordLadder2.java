package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadder2 {

  public List<List<String>> findLadders(String start, String end,
      Set<String> dict) {
    if (start == null || end == null || dict.isEmpty()) {
      return Collections.emptyList();
    }
    Graph graph = buildGraph(dict, start, end);
    List<List<String>> totalList = new ArrayList<List<String>>();
    LinkedList<String> currentList = new LinkedList<String>();

    Node startNode = graph.getNode(start);
    Node endNode = graph.getNode(end);
    findLadderHelper(startNode, endNode, graph, totalList, currentList);
    return totalList;
  }

  private Graph buildGraph(Set<String> dict, String start,
      String end) {

    Graph graph = new Graph();

    // add nodes
    for (String s : dict) {
      graph.addNode(new Node(s, false));
    }
    Node startNode = new Node(start, false);
    Node endNode = new Node(end, false);

    // add edges
    List<Node> list = graph.getNodes();
    
    graph.addNode(startNode);
    for (int i = 0; i < list.size(); i++) {
      if (isOneLetterChanged(list.get(i).word, startNode.word)) {
        graph.addEdge(startNode, list.get(i));
      }
    }
    
    graph.addNode(endNode);
    for (int i = 0; i < list.size(); i++) {
      if (isOneLetterChanged(list.get(i).word, endNode.word)) {
        graph.addEdge(list.get(i), endNode);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (isOneLetterChanged(list.get(i).word, list.get(j).word)) {
          graph.addEdge(list.get(i), list.get(j));
          graph.addEdge(list.get(j), list.get(i));
        }
      }
    }
    return graph;
  }

  private void findLadderHelper(Node start, Node end,
      Graph graph,
      List<List<String>> totalList,
      LinkedList<String> currentList) {
    currentList.add(start.word);
    if (start == end) {
      totalList.add(new ArrayList<String>(currentList));
      currentList.removeLast();
      return;
    }
    // find one in the set
    Set<Node> nexts = graph.fromNode(start);
    for (Node next : nexts) {
      if (!next.visit) {
        next.visit = true;
        findLadderHelper(next, end, graph, totalList, currentList);
        next.visit = false;
      }
    }
    currentList.removeLast();
  }

  private boolean isOneLetterChanged(String s1, String s2) {
    if (s1 == null || s2 == null) {
      return false;
    }
    if (s1.length() != s2.length()) {
      return false;
    }
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      if (c1 != c2) {
        count++;
        if (count == 2) {
          return false;
        }
      }
    }
    return true;
  }

  class Graph {

    Map<Node, Set<Node>> map;

    Graph() {
      map = new HashMap<Node, Set<Node>>();
    }

    public void addEdge(Node src, Node dst) {
      map.get(src).add(dst);
    }

    public void addNode(Node node) {
      map.put(node, new HashSet<Node>());
    }

    public List<Node> getNodes() {
      return new ArrayList<Node>(map.keySet());
    }

    public Node getNode(String word) {
      for (Node n : map.keySet()) {
        if (n.word.equals(word)) {
          return n;
        }
      }
      return null;
    }

    public Set<Node> fromNode(Node dst) {
      return map.get(dst);
    }
  }

  class Node {

    String word;
    boolean visit;
    Node parent;

    Node(String word, boolean visit) {
      this.word = word;
      this.visit = visit;
    }

    public int hashCode() {
      return word.hashCode();
    }
    
    public String toString() {
      return word + ":" + visit;
    }
  }
}
