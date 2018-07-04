package lesson1;

public class ATM {

	// never ever store pins in code!
	public static final String PIN = "1234"; 	// Constant value
	public static final int DAYS_IN_A_WEEK = 7; 	// Constant value
	
	public static void main(String[] args) {
		insertCard();
		String result = enterPin("1235");
		System.out.println(result);
		chooseAmount(1000);
		takeCard();
		takeMoney(1000);
	}

	private static void takeMoney(int amount) {
		fetchNotesFromCase(amount );
		System.out.println("Take Money");
	}

	private static void fetchNotesFromCase(int amount) {
		System.out.println("Fetch Notes from case: " + amount + " R ");
	}

	private static void takeCard() {
		System.out.println("Take your card");
	}

	private static void chooseAmount(int amount) {
		System.out.println("Choose Amount " + amount + " R");
	}

	private static String enterPin(String pin) {
		System.out.println("Enter PIN " + pin);
		
		// can be true or false
		boolean pinCorrect = false;
		// condition
		if (pin == PIN) {
			// executed, if condition is true
			pinCorrect = true;
		} else {
			// executed, if condition is false
			pinCorrect = false;
		}
		
		if (pinCorrect) {
			return "Pin is correct";
		}
		return "PIN is incorrect";
	}

	public static void insertCard() {
		System.out.println("Insert the Card");
	}

}
