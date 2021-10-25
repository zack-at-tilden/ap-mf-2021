package roman_numerals_pkg;


import java.util.HashMap;

public class RomanNumber {
	
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
	

	private int number;
	
	public RomanNumber(int number_in) {
		number = number_in;
	}

	public void display() {
		System.out.printf("%s\n",numbers.get(number));
	}
	
	public int getNumber() {
		return number;
	}
	

}
