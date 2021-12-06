package bubble_sort_pkg;

import java.util.Random;

public class Bubble_Sort_Main {

	public static void main(String[] args) {
	
		int[] numbers = new int[20];
		Random r = new Random();
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=r.nextInt(100);
		}
		
		
		for (int n : numbers) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		
		boolean done = false;
		
		while (!done) {
			done=true;
			for (int i=0; i<numbers.length-1;i++) {
				if (numbers[i]>numbers[i+1]) {
					int temp = numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
					done=false;
				}
			}
		}
		
		
		for (int n: numbers) {
			System.out.printf("%d ",n);
			}
		System.out.println();
		}
			

}
