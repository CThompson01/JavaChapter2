package tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		double wage, weeklyPay;
		int dependants;
		final double HOURS_IN_WEEK = Double.parseDouble(JOptionPane.showInputDialog("How many hours in the week"));
		wage = Double.parseDouble(JOptionPane.showInputDialog("Enter employee's hourly wage"));
		weeklyPay = wage * HOURS_IN_WEEK;
		dependants = Integer.parseInt(JOptionPane.showInputDialog("How many dependants?"));
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay +
				"\nDeductions will be made for " + dependants + " dependents.");
	}

}
