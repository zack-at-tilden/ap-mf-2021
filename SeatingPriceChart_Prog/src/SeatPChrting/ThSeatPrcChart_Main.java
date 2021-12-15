package SeatPChrting;
import java.util.Scanner;

public class ThSeatPrcChart_Main {

	public static void main(String[] args) {
		int[][] seating = {
				{10,10,10,10,10,10,10,10,10,10},
				{10,10,10,10,10,10,10,10,10,10},
				{10,10,10,10,10,10,10,10,10,10},
				{10,10,20,20,20,20,20,20,10,10},
				{10,10,20,20,20,20,20,20,10,10},
				{10,10,20,20,20,20,20,20,10,10},
				{20,20,30,30,40,40,30,30,20,20},
				{20,30,30,40,50,50,40,30,30,20},
				{30,40,50,50,50,50,50,50,40,30},
		};
		
		Scanner select = new Scanner(System.in);
		System.out.printf("Seat Choice or Price Choice? (answer 's' for Seat, answer 'p' for Price) >");
		String seatorprice = select.nextLine();
		if (seatorprice=="s") {
			System.out.printf("Which row? (from 0 to 8 based on farthest to closest) >");
			int row = select.nextInt();
			System.out.printf("Which column? (from 0 to 9 from right side of theater to left side of theater) >");
			int column = select.nextInt();
			if (seating[row][column] > 0) {
				seating[row][column] = 0;
				System.out.printf("request reserved");
			}
		}
		
	}

}
