package roman_numerals_pkg;

import java.util.HashMap;

public class RomanNumber2 {


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
public RomanNumber2(int number_in) {
	number = number_in;
}

//methods
private void displayLetter(int number_to_display) {
	System.out.printf("%s",numbers.get(number_to_display));
}

public void display() {
	int remainder = number;
	for (int i = remainder/1000;i>0;i--) {
		displayLetter(1000);
	}
	remainder = remainder%1000;
	if (remainder >= 900) {
		displayLetter(100);
		displayLetter(1000);
		remainder-=900;
	}
	if (remainder >= 500) {
		displayLetter(500);
		remainder -= 500;
	}
	else if (remainder >=400) {
		displayLetter(100);
		displayLetter(500);
		remainder -= 400;
	}		
	for (int i = remainder/100;i>0;i--) {
		displayLetter(100);
	}
	remainder = remainder%100;
	if (remainder >= 90) {
		displayLetter(10);
		displayLetter(100);
		remainder-=90;
	}
	if (remainder >= 50) {
		displayLetter(50);
		remainder-=50;
	}
	else if (remainder >= 40) {
		displayLetter(10);
		displayLetter(50);
		remainder -= 40;
	}
	for (int i = remainder/10;i>0;i--) {
		displayLetter(10);
	}
	remainder = remainder%10;
	if (remainder >= 9) {
		displayLetter(1);
		displayLetter(10);
		remainder-=9;
	}
	if (remainder >= 5) {
		displayLetter(5);
		remainder-=5;
	}
	else if (remainder >=4) {
		displayLetter(1);
		displayLetter(5);
		remainder -= 4;
	}
	for (int i = remainder/1;i>0;i--) {
		displayLetter(1);
	}
	
}



}