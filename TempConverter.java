public class TempConverter {
	public static void main(String[] args) {
		//Declaring variables
		int BASE = 32;
		int celsiusTemp = 24;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		 
		double fahrenheitTemp;
		//Converting to fahrenheit
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		//Printing the celsuis temp degree=24
		System.out.println ("Celsius Temperature: " + celsiusTemp);
		//Printing the converted fahrenheit degree=75.2
		System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
				
	}
}

/*
 * 
 */

