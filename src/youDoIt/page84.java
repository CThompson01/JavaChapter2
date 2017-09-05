package youDoIt;

import java.util.Scanner;

public class page84 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		String usersName = in.nextLine();
		System.out.print("Please enter an integer >> ");
		int anInt = in.nextInt();
		System.out.print("Please enter a byte integer >> ");
		byte aByte = in.nextByte();
		System.out.print("Please enter a short integer >> ");
		short aShort = in.nextShort();
		System.out.print("Please enter a long integer >> ");
		long aLong = in.nextLong();
		System.out.println("The int is " + anInt +
				"\nThe byte is " + aByte +
				"\nThe short is " + aShort + 
				"\nThe long is " + aLong + 
				"\nThank you " + usersName + "!");
		in.close();
	}
}
