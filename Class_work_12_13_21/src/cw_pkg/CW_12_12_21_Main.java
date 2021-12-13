package cw_pkg;

import java.util.Random;

public class CW_12_12_21_Main {

	public static void main(String[] args) {
		

		Random die = new Random();
		char[] letters = new char[100];
		
		for (int i = 0; i<letters.length; i++) {
			switch(die.nextInt(5)) {
				case 0:	letters[i]='A';
					break;
				case 1: letters[i]='B';
					break;
				case 2: letters[i]='C';
					break;
				case 3: letters[i]='D';
					break;
				case 4: letters[i]=(char)(48+die.nextInt(10));
					break;
			}
		}
		
		for (char e : letters) {
			
			
			System.out.printf("%s", e);

		}
		System.out.println();

	}

}
