package lesson1;

import java.util.Scanner;

public class MainForMethodsWithUserEntry {
	/** 
	 * This is the main method
	 */
	public static void main(String[] args) {
		// My fancy program
		makeCoffee(3);
	}

	public static void makeCoffee(int persons) {
		// change for git
        System.out.println("Want your coffee strong or normal?");
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("User input: " + scannerVariable.nextLine());
 
		// how much powder is needed?
		int powder = normal(persons);
		// fill powder amount
		fillPowder(powder);
		// fill water amount
		fillWater(big(persons));
		// press button
		pressButton();
	}
	
	// calculate powder for a strong coffee
	public static int strong(int persons) {
		return persons*3;
	}

	// calculate powder for a normal coffee
	public static int normal(int persons) {
		return persons*2;
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
	
	// press the button
	public static void pressButton() {
		System.out.println("Press Button!")	;
		
	}
	
	

}
