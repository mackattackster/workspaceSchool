package ch21.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		int n = 10;
		//Creates an array list of random integers
		ArrayList<Integer> ali = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			ali.add(r.nextInt(n));
		}
		System.out.println(ali.toString());
		System.out.println(Exercise21_3.removeDuplicates(ali).toString());
		//Creates an array list of random chars
		ArrayList<Character> alc = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			alc.add((char)(r.nextInt(n) + 'a'));
		}
		System.out.println(alc.toString());
		System.out.println(Exercise21_3.removeDuplicates(alc).toString());
		//Creates an array of random Integers and calls the maximum method
		Integer[] ari = new Integer[n];
		for (int i = 0; i < n; i++) {
			ari[i] = r.nextInt(n);
		}
		System.out.println(Arrays.toString(ari));
		System.out.println(Exercise21_5.maximum(ari).toString());
		//Creates an array of random Characters and calls the maximum method
		Character[] arc = new Character[n];
		for (int i = 0; i < n; i++) {
			arc[i] = (char)(r.nextInt(n) + 'a');
		}
		System.out.println(Arrays.toString(arc));
		System.out.println(Exercise21_5.maximum(arc).toString());
		
		System.out.println(ali.toString());
		System.out.println(Exercise21_10.maximum(ali).toString());
		
		System.out.println(alc.toString());
		System.out.println(Exercise21_10.maximum(alc).toString());
	}

}
