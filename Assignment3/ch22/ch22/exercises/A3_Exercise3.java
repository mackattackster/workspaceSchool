//Chris Mack CS3401 Assignment 3 Exercise 3
package ch22.exercises;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class A3_Exercise3 extends JFrame{
	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame();
	private static String[][] statecapital = {
		      {"Alabama", "Montgomery"},{"Alaska", "Juneau"},{"Arizona", "Phoenix"},{"Arkansas", "Little Rock"},
		      {"California", "Sacramento"},{"Colorado", "Denver"},{"Connecticut", "Hartford"},		      
		      {"Delaware", "Dover"},{"Florida", "Tallahassee"},{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"},		     
		      {"Idaho", "Boise"},{"Illinois", "Springfield"},{"Maryland", "Annapolis"},{"Minnesota", "Saint Paul"},
		      {"Iowa", "Des Moines"},{"Maine", "Augusta"},{"Kentucky", "Frankfort"},{"Indiana", "Indianapolis"},		     
		      {"Kansas", "Topeka"},{"Louisiana", "Baton Rouge"},{"Oregon", "Salem"},{"Oklahoma", "Oklahoma City"},{"Ohio", "Columbus"},
		      {"North Dakota", "Bismark"},{"New York", "Albany"},{"New Mexico", "Santa Fe"},{"New Jersey", "Trenton"},
		      {"New Hampshire", "Concord"},{"Nevada", "Carson City"},{"Nebraska", "Lincoln"},{"Montana", "Helena"},	
		      {"Missouri", "Jefferson City"},{"Mississippi", "Jackson"},{"Massachusettes", "Boston"},{"Michigan", "Lansing"},
		      {"Pennslyvania", "Harrisburg"},{"Rhode Island", "Providence"},{"South Carolina", "Columbia"},{"South Dakota", "Pierre"},
		      {"Tennessee", "Nashville"},{"Texas", "Austin"},{"Utah", "Salt Lake City"},{"Vermont", "Montpelier"},
		      {"Virginia", "Richmond"},{"Washington", "Olympia"},{"West Virginia", "Charleston"},{"Wisconsin", "Madison"},
		      {"Wyoming", "Cheyenne"}};
	private JButton jbtOK = new JButton("OK");
	private JButton jbtCancel = new JButton("Cancel");
	private JTextField text = new JTextField(20);
	private String state = statecapital[0][0];
	private String capital = statecapital[0][1];
	private JLabel label = new JLabel("Enter the Capital for " + state);
	private static List ali;
	private int count = 0;
	public static void main(String[] args) {
		ali = Arrays.asList(statecapital);
		A3_Exercise3 frame = new A3_Exercise3();
		frame.setSize(400,200);
		frame.setVisible(true);
		frame.setTitle("Capital Game");
	}//end of main
	public A3_Exercise3() {
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		jbtOK.addActionListener(new CheckListener());
		jbtCancel.addActionListener(new CancelListener());
		p1.add(label);
		p1.add(text);
		p2.add(jbtOK);
		p2.add(jbtCancel);
		setLayout(new GridLayout(2,2,1,1));
		add(p1);
		add(p2);
	}//end of constructor
	class CheckListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String temp = text.getText();
			if (temp.equalsIgnoreCase(capital)) {
				JOptionPane.showMessageDialog(null, "Your answer is correct");
				count++;
			}
			else {
				JOptionPane.showMessageDialog(null, "The correct answer is " + capital);
			}
			Random rn = new Random();
			int x = rn.nextInt(ali.size() - 1);
			capital = statecapital[x][1];
			state = statecapital[x][0];
			label.setText("Enter the Capital for " + state);
			text.setText("");
		}
	}//end of sort listener
	class CancelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "You got " + count + " correct!");
			System.exit(0);
		}	
	}//end of shuffle listener
}
