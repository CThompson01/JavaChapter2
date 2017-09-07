package exercises;

import javax.swing.JOptionPane;

public class InitialsInteractive {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your initials are: " + addPeriods(
				JOptionPane.showInputDialog("Initial One."), 
				JOptionPane.showInputDialog("Initial Two."), 
				JOptionPane.showInputDialog("Initial Three.")));
	}
	private static String addPeriods(String init1, String init2, String init3) {
		return init1 + "." + init2 + "." + init3 + "."; 
	}
}
