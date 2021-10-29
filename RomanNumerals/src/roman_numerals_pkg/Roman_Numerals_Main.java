package roman_numerals_pkg;

import java.util.Scanner;

public class Roman_Numerals_Main {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		while(!done) {
			System.out.printf("\nEnter a number to be converted: ");
			int input = in.nextInt();
			if (input!=0) {
				RomanNumber2 number = new RomanNumber2(input);
				number.display();
			} 
			else {
			done=true;
			System.out.printf("Thanks for playing!\n");
			}
		}
		
		in.close();
	}

}
