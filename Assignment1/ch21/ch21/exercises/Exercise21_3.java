package ch21.exercises;

import java.util.ArrayList;

public class Exercise21_3 {
//Programming exercise 21.3. Implement and test the following generic method that returns an Array 
//List. The new list contains the non-duplicate elements from the original list. 
	 
//Public statics <E> ArrayList<E> removeDuplicates(ARrayList<E> list)
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		int n = list.size();
		for(int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (!list.get(j).equals(list.get(i)))
						continue;
				list.remove(j);
				j--;
				n--;
			}
		}
		return list;
	}
}
