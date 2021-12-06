package die_streak2_pkg;

import java.util.ArrayList;
import java.util.Random;


public class Die_Streak2_Main {
	
	static final int DIE=4;
	static ArrayList<StreakObj> streaks = new ArrayList<StreakObj>();

	public static void main(String[] args) {
		
		Random die = new Random();
		int[] rollArray = new int[50];
		
		for (int i = 0; i < rollArray.length; i++) {
			rollArray[i] = die.nextInt(DIE)+1;
		}
		
		for (int e : rollArray) {
			System.out.printf("%d ", e);
		}
		System.out.println();
		
		
		
		for (int i = 1; i < rollArray.length; i++) {
			if (rollArray[i]==rollArray[i-1]) {
				
			}
		}
		
		
	}

}
