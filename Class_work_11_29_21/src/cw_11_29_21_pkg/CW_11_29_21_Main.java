package cw_11_29_21_pkg;

import java.util.ArrayList;

public class CW_11_29_21_Main {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		
		
		names.add("Andy");
		names.add("Bob");
		names.add("Carlos");
		
		
		
		names.set(1, "Bill");
		
		
		for (String name: names) {
			System.out.printf("%s\n",name);
		}
		
		System.out.printf("%d\n",names.size());
		
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		
		System.out.println(numbers);
		
		
		
		ArrayList<Box> boxes = new ArrayList<Box>();
		
		Box box = new Box(3,7,10);
		boxes.add(box);
		box = new Box(4,5,11);
		boxes.add(box);
		
		for (Box b : boxes) {
			System.out.printf("%d\n",b.getVolume());
		}
		
		
		System.out.printf("%s\n\n",names.get(2));
		
		
		
		
		int marray [][][] = new int[5][5][5];
		
		marray[1][2][3] = 50;
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				for (int k=0;k<5;k++) {
					System.out.printf("%2d ",marray[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}
