package exercises;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		final int QUARTS_IN_GALLON = 4;
		int quartsForPaintjob = 18;
		JOptionPane.showMessageDialog(null, "You need " + quartsForPaintjob / QUARTS_IN_GALLON + " gallons and " +
				quartsForPaintjob % QUARTS_IN_GALLON + " quarts");
	}

}
