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
	private void displayLetter(int number_to_display) {
		System.out.printf("%s",numbers.get(number_to_display));
	}

	
	
	public void calculate() {
		int value = thousands(number);
		value = hundreds(value);
		value = tens(value);
		value = ones(value);
	}
	
	
	private int thousands(int value_in) {
		int n = value_in / 1000;
		for (int i=n;i>0;i--) {
			displayLetter(1000);
		}
		return value_in-n*1000;
	}
	
	
	private int hundreds(int value_in) {
		int n = value_in / 100;
		int i = n;
		if (n==9) {
			displayLetter(100);
			displayLetter(1000);
		}
		else if (n>=5) {
			displayLetter(500);
			while (i-->5) {
				displayLetter(100);
			}
		}
		else if (n==4) {
			displayLetter(100);
			displayLetter(500);
		}
		else if (n>=1) {
			while (i-->0)
			displayLetter(100);
		}
		
		return value_in-n*100;
	}
	
	
	private int tens(int value_in) {
		int n = value_in / 10;
		int i = n;
		if (n==9) {
			displayLetter(10);
			displayLetter(100);
		}
		else if (n>=5) {
			displayLetter(50);
			while (i-->5) {
				displayLetter(10);
			}
		}
		else if (n==4) {
			displayLetter(10);
			displayLetter(50);
		}
		else if (n>=1) {
			while (i-->0)
			displayLetter(10);
		}
		
		return value_in-n*10;
	}
	
	
	private int ones(int value_in) {
		int n = value_in / 1;
		int i = n;
		if (n==9) {
			displayLetter(1);
			displayLetter(10);
		}
		else if (n>=5) {
			displayLetter(5);
			while (i-->5) {
				displayLetter(1);
			}
		}
		else if (n==4) {
			displayLetter(1);
			displayLetter(5);
		}
		else if (n>=1) {
			while (i-->0)
			displayLetter(1);
		}
		
		return value_in-n*1;
	}
	
	
	
	
	/*
	
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

	private void lessThanTen(int value_in) {
		if
	}

	*/

}
