package tutorials;

import javax.swing.JOptionPane;

public class AirlineDialog {
	public static void main(String[] args) {
		boolean isYes = (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?"));
		JOptionPane.showMessageDialog(null, "You responded " + isYes);
	}
}
