package lesson1;

public class MainForMethods {
	/** 
	 * This is the main method
	 */
	public static void main(String[] args) {
		// My fancy program
		int numberOfPersons = 3;
		makeBlackCoffeeFor(numberOfPersons);
		makeWhiteCoffeeFor(6);
	}

	private static void makeBlackCoffeeFor(int persons) {
		System.out.println("Make a black coffee!");
		// how much powder is needed?
		int powder = normal(persons);
		// fill powder amount
		fillPowder(powder);
		// fill water amount
		fillWater(big(persons));
		// press button
		pressButton();
	}

	public static void makeWhiteCoffeeFor(int persons) {
		System.out.println("Make a white coffee!");
		// how much powder is needed?
		int powder = normal(persons);
		// fill powder amount
		fillPowder(powder);
		// fill water amount
		fillWater(big(persons));
		// fill milk
		fillMilk(10);
		// press button
		pressButton();
	}

	public static int normalCoffee = 4;
	// calculate powder for a normal coffee
	public static int normal(int persons) {
		return persons*2;
	}

	// calculate powder for a strong coffee
	public static int strong(int persons) {
		return persons*3;
	}


	// calculate water for a small cup
	public static int small(int persons) {
		return persons*150;
	}

	// calculate water for a big cup
	public static int big(int persons) {
		return persons*250;
	}

	// fill the powder
	public static void fillPowder(int spoons) {
	System.out.println("Fill Powder! " + spoons + " Spoons")	;
	}
	
	// fill the water
	public static void fillWater(int ml) {
		String s = "Fill Water!" + ml + " ml";
		System.out.println(s)	;
		
	}
	
	public static void fillMilk(int ml) {
		String s = "Fill Milk!" + ml + " ml";
		System.out.println(s)	;
		
	}
	
	// press the button
	public static void pressButton() {
		System.out.println("Press Button!")	;
		
	}

}
