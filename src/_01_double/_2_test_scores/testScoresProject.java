package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScoresProject {
public static void main(String[] args) {
	String testScore = JOptionPane.showInputDialog("What is your test score?");
	double TS = Double.parseDouble(testScore); 
	if (TS>=95) {
		JOptionPane.showMessageDialog(null, "You got a good test score!"); 
	}
	else {
		JOptionPane.showMessageDialog(null, "Your trash. Go wash dishes for a living!");
	}
}
}
