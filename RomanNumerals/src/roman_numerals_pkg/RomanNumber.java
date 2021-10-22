package roman_numerals_pkg;


import java.util.HashMap;

public class RomanNumber {
	
	static private HashMap<String,Integer> numbers = new HashMap<String,Integer>();
	static {
		numbers.put("I",1);
		numbers.put("V",5);
		numbers.put("X",10);
		numbers.put("L",50);
		numbers.put("C",100);
		numbers.put("D",500);
		numbers.put("M",100);
	}
	

	private int number;
	
	public RomanNumber(int number_in) {
		number = number_in;
	}

	
	public int getNumber() {
		return number;
	}
	

}
