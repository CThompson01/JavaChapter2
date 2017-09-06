package exercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		final int QUARTS_IN_GALLON = 4;
		int quartsForPaintjob = 18;
		System.out.println("You need " + quartsForPaintjob / QUARTS_IN_GALLON + " gallons and " +
				quartsForPaintjob % QUARTS_IN_GALLON + " quarts");
	}

}
