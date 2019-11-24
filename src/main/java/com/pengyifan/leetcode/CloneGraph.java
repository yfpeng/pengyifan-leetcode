package com.pengyifan.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.pengyifan.leetcode.commons.UndirectedGraphNode;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a
 * list of its neighbors.
 * <p>
 * OJ's undirected graph serialization:
 * <p>
 * Nodes are labeled uniquely. We use <code>#</code> as a separator for each
 * node, and <code>,</code> as a separator for node label and each neighbor of
 * the node.
 * <p>
 * As an example, consider the serialized graph <code>{0,1,2#1,2#2,2}</code>.
 * <p>
 * The graph has a total of three nodes, and therefore contains three parts as
 * separated by #.
 * <ol>
 * <li>First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * <li>Second node is labeled as 1. Connect node 1 to node 2.
 * <li>Third node is labeled as 2. Connect node 2 to node 2 (itself), thus
 * forming a self-cycle. </o.> Visually, the graph looks like the following:
 * 
 * <pre>
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * </pre>
 */
public class CloneGraph {

  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    if (node == null) {
      return node;
    }
    // get nodes
    Set<UndirectedGraphNode> nodes = new HashSet<UndirectedGraphNode>();

    Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
    queue.offer(node);
    while (!queue.isEmpty()) {
      UndirectedGraphNode cur = queue.poll();
      if (!nodes.contains(cur)) {
        nodes.add(cur);
        for (UndirectedGraphNode next : cur.neighbors) {
          if (!nodes.contains(next)) {
            queue.offer(next);
          }
        }
      }
    }
    // copy
    UndirectedGraphNode newRoot = null;
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
    for (UndirectedGraphNode n : nodes) {
      UndirectedGraphNode newN = new UndirectedGraphNode(n.label);
      map.put(n, newN);
      if (n == node) {
        newRoot = newN;
      }
    }
    // copy link
    for (UndirectedGraphNode n : nodes) {
      UndirectedGraphNode newN = map.get(n);
      for (UndirectedGraphNode next : n.neighbors) {
        newN.neighbors.add(map.get(next));
      }
    }
    return newRoot;
  }
}
