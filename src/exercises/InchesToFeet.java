package exercises;

import javax.swing.JOptionPane;

public class InchesToFeet {
	public static void main(String[] args) {
		float inches = Float.parseFloat(JOptionPane.showInputDialog("How many inches?","6"));
		JOptionPane.showMessageDialog(null, "Inches: " + (int)inches + "\nFeet: " + inches / 12);
	}
}
