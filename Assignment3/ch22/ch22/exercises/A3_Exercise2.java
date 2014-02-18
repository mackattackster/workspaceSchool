package ch22.exercises;

import javax.swing.*;

//Write a Java program that reads allows the user to enter numbers (from a graphical user interface) and 
//displays all the entered numbers in a text area as shown below. Use a linked list to store the numbers 
//(no duplicates). Add buttons Sort, Shuffle, and Reverse to sort, shuffle and reverse the list as shown 
//below. 

public class A3_Exercise2 extends JApplet {
	public A3_Exercise2() {
		NumberApp n = new NumberApp();
	}

	class NumberApp extends JPanel {
		private JButton jbtAdd = new JButton("Add");
		private JButton jbtSort =  new JButton("Sort");
		private JButton jbtShuffle = new JButton("Shuffle");
		private JButton jbtReverse = new JButton("Reverse");
	}
	
}

