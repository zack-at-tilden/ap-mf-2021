package die_streak2_pkg;

public class StreakObj {
	private int pos,len,num;
	
	public StreakObj(int p, int l, int n) {
		pos=p;
		len=l;
		num=n;
	}

	public int getLength() {
		return len;
	}	
	
	public void incrementLength() {
		len++;
	}
	
}
