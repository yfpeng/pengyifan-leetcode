package com.pengyifan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair
 * of integers (h, k), where h is the height of the person and k is the number of people in front
 * of
 * this person who have a height greater than or equal to h. Write an algorithm to reconstruct the
 * queue.
 * <p>
 * Note:
 * The number of people is less than 1,100.
 * <pre>
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * </pre>
 */
public class QueueReconstructionByHeight {
  public int[][] reconstructQueue(int[][] people) {
    if (people == null || people.length == 0) {
      return people;
    }

    List<Person> list = new ArrayList<>();
    for (int[] person : people) {
      list.add(new Person(person[0], person[1]));
    }
    list.sort((p1, p2) -> {
      int c = -Integer.compare(p1.height, p2.height);
      if (c == 0) {
        c = Integer.compare(p1.number, p2.number);
      }
      return c;
    });

    List<Person> queue = new ArrayList<>();
    for (Person p : list) {
      queue.add(p.number, p);
    }

    people = new int[people.length][2];
    for (int i = 0; i < people.length; i++) {
      people[i] = new int[2];
      people[i][0] = queue.get(i).height;
      people[i][1] = queue.get(i).number;
    }
    return people;
  }

  private static class Person {
    int height;
    int number;

    Person(int height, int number) {
      this.height = height;
      this.number = number;
    }
  }
}
