package ch21.exercises;

import java.util.ArrayList;

public class Exercise21_10 {
//Programming exercise 21.10: Implement and test the following 
//generic method that returns the largest element in an ArrayList. 
	 
//Public statics <E extends Comparable<E>> E max(ArrayList<E> list) 

	public static <E extends Comparable<E>> E maximum(ArrayList<E> list) {
		int s = list.size() - 1;
		E min = list.get(0);
		E max = list.get(s);
		
		for (int i = 0; i < s; i++) {
			if (max.compareTo(list.get(i)) > 0)
				min = list.get(i);
			if (max.compareTo(list.get(i)) < 0)
				max = list.get(i);
		}
		
		return max;
	}
}
