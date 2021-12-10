package die_streak2_pkg;

import java.util.ArrayList;
import java.util.Random;


public class Die_Streak2_Main {
	
	static final int DIE=3;
	static final int LEN=100;
	static ArrayList<StreakObj> streaks = new ArrayList<StreakObj>();

	public static void main(String[] args) {
		
		Random die = new Random();
		int[] rollArray = new int[LEN];
		
		for (int i = 0; i < rollArray.length; i++) {
			rollArray[i] = die.nextInt(DIE)+1;
		}
		
		for (int e : rollArray) {
			System.out.printf("%d ", e);
		}
		System.out.println();
		
		int streak_length=1;
		boolean streak_found=false;
		for (int i = 1; i < rollArray.length; i++) {
			if (rollArray[i]==rollArray[i-1]) {
				streak_length++;
				streak_found=true;
			}
			else {
				if (streak_found) {
					StreakObj streak = new StreakObj(i-streak_length,streak_length,rollArray[i-1]);
					streaks.add(streak);
					streak_length=1;
					streak_found=false;
				}
			}
			
		}
		
		for (StreakObj so:streaks) {
			so.printInfo();
		}
		System.out.println();
		
		int longest_so_far=2;
		int longest_streak_position=0;
		//ArrayList<StreakObj> longest_streaks = new ArrayList<StreakObj>();
		for (int i=0; i<streaks.size();i++) {
			if (streaks.get(i).getLength()>longest_so_far) {
				longest_so_far=streaks.get(i).getLength();
				longest_streak_position=i;
			}
		}
		
		System.out.printf("Longest streak: ");
		streaks.get(longest_streak_position).printInfo();
		System.out.println();
		int arrayPos = streaks.get(longest_streak_position).getPosition();
		int arrayLen = streaks.get(longest_streak_position).getLength()-1;
		

		for (int i=0;i<rollArray.length;i++) {
			if(i==arrayPos) {
				System.out.printf("(%d ",rollArray[i]);
			}
			else if(i==arrayPos+arrayLen) {
				System.out.printf("%d) ",rollArray[i]);
			}
			else System.out.printf("%d ", rollArray[i]);
		}
		
	}

}
