package cw_10_18_21_pkg;

import java.util.Scanner;

public class CW_10_18_21_Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your income: ");
		double income = in.nextDouble();
		
		System.out.print("Are you married?(Y/N) ");
		String input = in.next();
		
		int status;
		if (input.equals("Y") || input.equals("y")) {
			status = TaxReturn.MARRIED;
		}
		else {
			status = TaxReturn.SINGLE;
		}
		
		TaxReturn aTaxReturn = new TaxReturn(income,status);
		
		System.out.printf("Tax: %,.2f\n", aTaxReturn.getTax());
		
		in.close();

	}

}
