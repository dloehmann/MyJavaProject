package lesson1;

public class MainVariables {
	/** 
	 * This is the main method
	 */
	public static void main(String[] args) {
		// My fancy program
		String hw = "Hello World!";
		int i = 12;
		int j = 42;
		double k = 12.0;
		double m = 42.0;

		System.out.println(hw); // 
		System.out.println(k/m); // 
		System.out.println(add(i,j)); // 

	}
	
	public static int add(int i, int j) {
		return i+j;
	}

}
