package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer = JOptionPane.showInputDialog("How many nickles do you have?");
int answerInt = Integer.parseInt(answer);
String answer2 = JOptionPane.showInputDialog("How many dimes do you have?");
int answer2Int = Integer.parseInt(answer2); 
String answer3 = JOptionPane.showInputDialog("How many quarters do you have?");
int answer3Int = Integer.parseInt(answer3); 
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double AP1 = answerInt*0.05;
double AP2 = answer2Int*0.1; 
double AP3 = answer3Int*0.25;
		// Ask the user how many dimes they have, and convert their answer
JOptionPane.showMessageDialog(null, "You have $" + (AP1 + AP2 + AP3)); 
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

