package exercises;

import javax.swing.JOptionPane;

public class Initials {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your initials are: " + addPeriods(
				JOptionPane.showInputDialog("First Initial."), 
				JOptionPane.showInputDialog("Second Initial."), 
				JOptionPane.showInputDialog("Third Initial.")));
	}
	private static String addPeriods(String init1, String init2, String init3) {
		return init1 + "." + init2 + "." + init3 + "."; 
	}
}
