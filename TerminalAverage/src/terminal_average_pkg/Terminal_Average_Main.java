package terminal_average_pkg;

import java.util.Scanner;

public class Terminal_Average_Main {
	

	private static double sum=0;
	private static int count=0;
	
	public Terminal_Average_Main() {
		//place holder
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.printf("Enter a decimal value (non-numeric to quit): ");
		while(in.hasNextDouble()) {
			Double value=in.nextDouble();
			System.out.printf("%f\n",value);
			count++;
			sum+=value;
			System.out.printf("Enter a decimal value (non-numeric to quit): ");
		}
		System.out.printf("The sum of the values is %f\n",sum);
		System.out.printf("The average of the values is %f\n",sum/count);
		System.out.printf("Exiting. Bye!");
		
		in.close();
	}

}
