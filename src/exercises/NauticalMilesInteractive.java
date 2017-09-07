package exercises;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
	public static void main(String[] args) {
		final double KILOMETERS_IN_NAUTICALMILE = 1.852;
		final double MILES_IN_NAUTICALMILE = 1.150779;
		float nauticalMiles = Float.parseFloat(JOptionPane.showInputDialog("How many nautical miles?" , "5"));
		JOptionPane.showMessageDialog(null, nauticalMiles + " Nautical Miles is \n" +
										nauticalMiles * KILOMETERS_IN_NAUTICALMILE + " Kilometers\n" +
										nauticalMiles * MILES_IN_NAUTICALMILE + " Miles");
	}
}
