package madlibs;

import javax.swing.JOptionPane;

public class Main {
	/**
	 * Creates a message box that shows the story with the inputs of the user
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "The " + 
		input("Please input color", "red") +
		" Dragon is the  " +
		input("Please input a word ending in -est", "tallest") +
		" Dragon of all. It has " +
		inputint("Please input a number", "55") + 
		input("Please input a body part plural", "arms") +
		", and a " + 
		input("Please input an animal", "horse") +
		" shaped like a " + 
		input("Please input a noun", "house") + 
		". It loves to eat " +
		input("Please input a plural noun", "schools") + 
		", although it will feast on nearly anything."); 
	}
	
	/**
	 * Creates a dialog box that asks for input of a specific thing
	 * @param message Describe the item needed for input
	 * @param defaultAnswer The default answer being displayed
	 * @return Returns the input of the dialog box and adds it to the story
	 */
	private static String input(String message, String defaultAnswer) {
		return JOptionPane.showInputDialog(message, defaultAnswer);
	}
	
	/**
	 * Creates a dialog box that asks for a number
	 * @param message Describes the item needed for input
	 * @param defaultAnswer The default answer being displayed
	 * @return Returns the input of the dialog box and adds it to the story
	 */
	private static int inputint(String message, String defaultAnswer) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(message, defaultAnswer));
		int b = (int)(Math.random() * 100);
		int c = a - b;
		return c;
	}
}
