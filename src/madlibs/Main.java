package madlibs;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "There once was a " + 
		input("Please input an adjective", "red") + " " +
		input("Please input an animal", "horse") +
		" who lived in a " +
		input("Please input a noun", "house") + ". " +
		"One day he started walking around some " +
		input("Please input a plural noun", "schools") + " " +
		"when all of a sudden " +
		input("Please input a celebrity", "John Cena") +
		" jumped out and hurt his " + 
		input("Please input a body part", "arms") + 
		" making him the " +
		input("Please input a word ending in -est", "tallest") + 
		" thing in existance."); 
	}
	
	private static String input(String message, String defaultAnswer) {
		return JOptionPane.showInputDialog(message, defaultAnswer);
	}

}
