package exercises;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		final int QUARTS_IN_GALLON = 4;
		int quartsForPaintjob = Integer.parseInt(JOptionPane.showInputDialog("How many quarts do you need? ", "4"));
		JOptionPane.showMessageDialog(null, "You need " + quartsForPaintjob / QUARTS_IN_GALLON + " gallons and " +
				quartsForPaintjob % QUARTS_IN_GALLON + " quarts");
	}

}
