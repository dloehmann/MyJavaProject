package lesson1;

public class MainForMethods {
	/** 
	 * This is the main method
	 */
	public static void main(String[] args) {
		// My fancy program
		makeCoffee(3);
	}

	public static void makeCoffee(int persons) {
		int powder = normal(persons);
		fillPowder(powder);
		fillWater(persons*250);
		pressButton();
	}
	
	public static int strong(int persons) {
		return persons*3;
	}

	public static int normal(int persons) {
		return persons*2;
	}

	public static void fillPowder(int spoons) {
	System.out.println("Fill Powder! " + spoons + " Spoons")	;
	}
	
	public static void fillWater(int ml) {
		System.out.println("Fill Water!" + ml + " ml")	;
		
	}
	
	public static void pressButton() {
		System.out.println("Press Button!")	;
		
	}

}
