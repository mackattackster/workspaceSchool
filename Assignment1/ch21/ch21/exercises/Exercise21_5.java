package ch21.exercises;

public class Exercise21_5 {
//Programming exercise 21.5: Implement and test the following 
//generic method that returns the maximum element in an array. 
	 
//Public statics <E extends Comparable<E>> E max(E{} list) 

	public static <E extends Comparable<E>> E maximum(E[] list) {
		E min = list[0];
		E max = list[list.length - 1];
		int s = list.length - 1;
		
		for(int i = 0; i < s; i++) {
			if (max.compareTo(list[i]) > 0)
				min = list[i];
			if (max.compareTo(list[i]) < 0)
				max = list[i];
		}
		if(max.compareTo(min) == 0)
			maximum(list);
		
		return max;
	}
}
