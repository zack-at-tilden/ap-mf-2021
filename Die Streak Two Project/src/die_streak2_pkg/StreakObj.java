package die_streak2_pkg;

public class StreakObj {
	private int pos,len,num;
	

	public StreakObj(int p, int l, int n) {
		pos =p;
		len =l; // set to 1
		num =n;
	}
	
	public int getLength() {
		return len;
	}	
	
	public void printInfo() {
		System.out.printf("(p%d, l%d, n%d) ",pos,len,num);
	}
	
}
