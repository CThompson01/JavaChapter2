package exercises;

import javax.swing.JOptionPane;

public class InitialsInteractive {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your initials are: " + addPeriods(
				getInitials(JOptionPane.showInputDialog("First Name.")), 
				getInitials(JOptionPane.showInputDialog("Middle Name.")), 
				getInitials(JOptionPane.showInputDialog("Last Name."))));
	}
	private static String getInitials(String name) {
		return String.valueOf(name.charAt(0));
	}
	private static String addPeriods(String init1, String init2, String init3) {
		return init1 + "." + init2 + "." + init3 + "."; 
	}
}
