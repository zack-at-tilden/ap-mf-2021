package roman_numerals_pkg;


import java.util.HashMap;

public class RomanNumber {
	
	//static variables
	static private HashMap<Integer,String> numbers = new HashMap<Integer,String>();
	static {
		numbers.put(1,"I");
		numbers.put(5,"V");
		numbers.put(10,"X");
		numbers.put(50,"L");
		numbers.put(100,"C");
		numbers.put(500,"D");
		numbers.put(1000,"M");
	}
	
	//instance variables
	private int number;
	
	//constructor
	public RomanNumber(int number_in) {
		number = number_in;
	}

	//methods
	private void displayLetter(int value_in) {
		System.out.printf("%s",numbers.get(value_in));
	}

	public void display() {
		if (number < 4) {
			lessThanFour(number);
		}
		else {
			lessThanNine(number);
		}
		System.out.printf("\n");
	}
	
	private void lessThanFour(int value_in) {
		while (value_in > 0) {
			displayLetter(1);
			value_in-=1;
		}
	}
	
	private void lessThanNine(int value_in) {
		if (value_in == 4) {
			displayLetter(1);
			displayLetter(5);
		}
		else {
			displayLetter(5);
			lessThanFour(number-5);
		}
	}


	

}
