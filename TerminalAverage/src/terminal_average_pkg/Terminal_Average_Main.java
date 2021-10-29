package terminal_average_pkg;

import java.util.Scanner;

public class Terminal_Average_Main {
	

	private static double sum;
	
	public Terminal_Average_Main() {
		//do nothing
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.printf("Enter a decimal value (non-numeric to quit): ");
		while(in.hasNextDouble()) {
			Double value=in.nextDouble();
			System.out.printf("%f\n",value);
			System.out.printf("Enter a decimal value (non-numeric to quit): ");
		}

		System.out.printf("Exiting. Bye!");
	}

}
