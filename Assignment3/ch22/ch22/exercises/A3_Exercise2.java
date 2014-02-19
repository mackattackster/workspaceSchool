//Chris Mack CS3401 Assignment 3 Exercise 2
package ch22.exercises;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

//Write a Java program that reads allows the user to enter numbers (from a graphical user interface) and 
//displays all the entered numbers in a text area as shown below. Use a linked list to store the numbers 
//(no duplicates). Add buttons Sort, Shuffle, and Reverse to sort, shuffle and reverse the list as shown 
//below. 

public class A3_Exercise2 extends JFrame {
	private static final long serialVersionUID = -7117943118812403720L;
	private JButton jbtSort = new JButton("Sort");
	private JButton jbtShuffle = new JButton("Shuffle");
	private JButton jbtReverse = new JButton("Reverse");
	private JTextField num = new JTextField(3);
	private JTextField display = new JTextField(10);
	private ArrayList<Integer> ali = new ArrayList<Integer>();
	public static void main(String[] args) {
		A3_Exercise2 frame = new A3_Exercise2();
		frame.setTitle("Numbers");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}//end of main
	
	public A3_Exercise2() {
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new GridLayout(1,1,1,1));
		JPanel p3 = new JPanel(new FlowLayout());
		jbtSort.addActionListener(new SortListener());
		jbtShuffle.addActionListener(new ShuffleListener());
		jbtReverse.addActionListener(new ReverseListener());
		num.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String temp = num.getText();
					ali.add(Integer.parseInt(temp));
					num.setText(null);
				}
				display.setText(ali.toString());
			}
		});
		p1.add(new JLabel("Enter a number"));
		p1.add(num);
		p2.add(display);
		p3.add(jbtSort, BorderLayout.LINE_START);
		p3.add(jbtShuffle, BorderLayout.CENTER);
		p3.add(jbtReverse, BorderLayout.LINE_END);
		setLayout(new GridLayout(3,1,1,1));
		add(p1);
		add(p2);
		add(p3);
	}//end of constructor
	
	class SortListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Collections.sort(ali);
			display.setText(ali.toString());
		}
	}//end of sort listener
	
	class ShuffleListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Collections.shuffle(ali);
			display.setText(ali.toString());
		}	
	}//end of shuffle listener
	
	class ReverseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Collections.reverse(ali);
			display.setText(ali.toString());
		}
	}//end of Reverse listener
	
}

