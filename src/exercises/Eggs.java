package exercises;

import javax.swing.JOptionPane;

public class Eggs {
	/**
	 * Takes an amount of eggs as input and displays the cost
	 * @param args
	 */
	public static void main(String[] args) {
		final double DOZEN_EGGS = 3.25;
		final double SOLO_EGGS = 0.45;
		int eggsOrdered = Integer.parseInt(JOptionPane.showInputDialog("How many eggs?"));
		double totalCost = ((eggsOrdered / 12) * DOZEN_EGGS) + ((eggsOrdered % 12) * SOLO_EGGS);
		JOptionPane.showMessageDialog(null, "You ordered " + eggsOrdered + " eggs.\n" + 
							"Thats " + eggsOrdered / 12 + " dozen at $" + DOZEN_EGGS + " a dozen.\n" +
							"With " + eggsOrdered % 12 + " loose eggs at $" + SOLO_EGGS + " per loose egg.\n" +
							"Your total is $" + eggTotalCost(totalCost));
	}
	
	/**
	 * Makes sure the cost always displays with two decimal places
	 * @param costing The total cost that is input
	 * @return The total cost with two decimal places
	 */
	private static String eggTotalCost(double costing) {
		String totCost = Double.toString(costing);
		if (totCost.length() <= 3) {
			totCost += "0";
		}
		return totCost;
	}
}
