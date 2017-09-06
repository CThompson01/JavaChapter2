package tutorials;

import javax.swing.JOptionPane;

public class HelloNameDialog {

	public static void main(String[] args) {
		/*
		 *  Difference between JOptionPane is you 
		 *  don't have to make an instance of it
		 *  but you do with a Scanner. 
		 */
		JOptionPane.showMessageDialog(null, "Hello, " + JOptionPane.showInputDialog("What is your name?"));
	}

}
