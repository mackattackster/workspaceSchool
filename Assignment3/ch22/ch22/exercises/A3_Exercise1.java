package ch22.exercises;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.*;

//Write a Java program that reads words from a text file and displays all the words (including duplicates) 
//in ascending alphabetical order. The word must start with a letter. Hint: make use of class Collections 
//static methods (see section 22.6, page 805, 9th edition). Use an Applet for this program. 

public class A3_Exercise1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> words = ReadFile();
		System.out.println(Sort(words));

	}
	
	public static ArrayList<String> ReadFile() throws FileNotFoundException {
		java.io.File file = new java.io.File("Words.txt");
		Scanner input = new Scanner(file);
		ArrayList<String> w = new ArrayList<String>();
		while (input.hasNextLine()) {
			w.add(input.nextLine());
		}
		input.close();
		return w;
	}
	
	public static ArrayList<String> Sort(ArrayList<String> w) {
		Collections.sort(w);
		return w;
	}
	
	public void init() {
	
	}
}
