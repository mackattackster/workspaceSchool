package ch29.exercises;


// This program illustrates performance testing for membership and remove oprtations.

import java.util.*;

public class PerformanceTestExample {
  static final int N = 5000;
  
  public static void main(String[] args) {  
    // Add numbers 0, 1, 2, ..., N - 1 to the array list
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++)
      list.add(i);
    Collections.shuffle(list); // Shuffle the array list
  
    // Create an array list, and test its performance
    Collection<Integer> list1 = new ArrayList<Integer>(list);
    System.out.println("Member search time for array list is " +
      getTestTime(list1) + " milliseconds");
    System.out.println("Remove element time for array list is " +
      getRemoveTime(list1) + " milliseconds\n");

    // Create a linked list, and test its performance
    Collection<Integer> list2 = new LinkedList<Integer>(list);
    System.out.println("Member search time for linked list is " +
      getTestTime(list2) + " milliseconds");
    System.out.println("Remove element time for linked list is " +
      getRemoveTime(list2) + " milliseconds\n");
  }

  public static long getTestTime(Collection<Integer> c) {
    long startTime = System.currentTimeMillis();

    // Test if a number is in the collection
    for (int i = 0; i < N; i++)
      c.contains((int)(Math.random() * 2 * N));

    return System.currentTimeMillis() - startTime; 
  }
  
  public static long getRemoveTime(Collection<Integer> c) {
    long startTime = System.currentTimeMillis();

    // Remove all element from the collection
    for (int i = 0; i < N; i++)
      c.remove(i);

    return System.currentTimeMillis() - startTime; 
  }
}