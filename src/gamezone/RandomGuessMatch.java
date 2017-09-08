package gamezone;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomGuessMatch {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNum = (int)rand.nextInt((5 - 1) + 1) + 1;
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-5"));
		if (guess == randomNum) {
			JOptionPane.showMessageDialog(null, "You guessed right! \nThe number was " + randomNum);
		} else {
			JOptionPane.showMessageDialog(null, "You guessed wrong. \nThe number was " + randomNum +
												"\nThe difference: " + Math.abs(randomNum - guess));
		}
	}
}
