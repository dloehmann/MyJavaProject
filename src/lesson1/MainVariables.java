package lesson1;

public class MainVariables {
	/** 
	 * This is the main method
	 */
	public static void main(String[] args) {
		// define a text variable
		String hw = "Hello World!";
		// define an integer number
		int i = 12;
		int j = 42;
		// define a comma number (needs double memory space)
		double k = 4000;
		double m = 5;

		// print it all out
		System.out.println(hw); // 
		System.out.println(k/m); // 
		System.out.println(add(i,j)); // 

	}
	
	// define an add function
	public static int add(int i, int j) {
		return i+j;
	}

}
