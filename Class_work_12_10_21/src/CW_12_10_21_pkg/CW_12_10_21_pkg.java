package CW_12_10_21_pkg;

import java.util.Random;


public class CW_12_10_21_pkg {

	public static void main(String[] args) {

		int[] myArray = new int[100];
		
		System.out.printf("%d\n",myArray[0] );
		
		Random r = new Random();
		
		for (int i =0; i<myArray.length; i++) {
			myArray[i]=r.nextInt(6)+1;
		}
		
		
		for (int element : myArray) {
			System.out.printf("%d ",element);
		}
		System.out.println();
		
		
		int j=0;
		for (int element : myArray) {
			System.out.printf("%d ",element);
			myArray[j++]=1;
		}
		System.out.println();
		
		
		
		for (int element : myArray) {
			System.out.printf("%d ",element);
		}
		System.out.println();

	}

}
