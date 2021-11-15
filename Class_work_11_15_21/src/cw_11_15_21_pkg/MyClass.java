package cw_11_15_21_pkg;

import java.util.ArrayList;

public class MyClass {
	
	
	private int[] array = new int[100];
	
	private int[][] array_2d = new int[10][10];
	
	
	private ArrayList<Integer> aList = new ArrayList<Integer>();
	
	
	public void MyMethod() {
		System.out.println(array_2d[0][0]);
	}
	
	
	
	public void MyMethod2() {
		
		aList.add(100);
		aList.add(175);
		aList.add(250);
		
		for (int number : aList) {
			System.out.printf("%d ",number);
		}
		
		aList.remove(1);
		
		System.out.println();
		
		for (int number : aList) {
			System.out.printf("%d ", number);
		}
	}
}
