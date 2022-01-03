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
		if (seatorprice.equals("s")) {
			for (int i = 0;i < 9;i++) {
				for (int j = 0;j < 10;j++) {
					System.out.printf("%d ",seating[i][j]);
				}
				System.out.println();
			}
			System.out.printf("Which row? (from 0 to 8 based on farthest to closest) >");
			int row = select.nextInt();
			for (int j = 0;j < 10;j++) {
				System.out.printf("%d ",seating[row][j]);
			}
			System.out.println();
			System.out.printf("Which column? (from 0 to 9 from right side of theater to left side of theater) >");
			int column = select.nextInt();
			if (seating[row][column] > 0) {
				System.out.printf("%d ",seating[row][column]);
				seating[row][column] = 0;
				System.out.printf("request reserved\n");
			}
			for (int j = 0;j < 10;j++) {
				System.out.printf("%d ",seating[row][j]);
			}
		} else if (seatorprice.equals("p")) {
			for (int i = 8;i > -1;i--) {
				for (int j = 0;j < 10;j++) {
					System.out.printf("%d ",seating[i][j]);
				}
				System.out.println();
			}
			System.out.printf("Select a price: (Choices are 10, 20, 30, 40, 50) >");
			int price = select.nextInt();
			label1:
			for (int i = 8;i > -1;i--) {
				for (int j = 0;j < 10;j++) {
					if (seating[i][j] == price) {
						seating[i][j] = 0;
						break label1;
					}
				}
			}
			for (int i = 8;i > -1;i--) {
				for (int j = 0;j < 10;j++) {
					System.out.printf("%2d ",seating[i][j]);
				}
				System.out.println();
			}
			System.out.printf("request reserved\n");
		}
		
	}

}
