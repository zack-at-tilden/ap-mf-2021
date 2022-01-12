//possible variables: xpos, ypos, spots, color scaling, size, hibernating?, life stage, threatened?, hungry?
public class LadyBug {

	int xpos, ypos, spots, life_stage;
	boolean hibernating, threatened, hungry;
	double size;
	String color;
	
	public LadyBug(int x,int y,int spotcount,String coloring,double sizing,int stage) {
		xpos = x;
		ypos = y;
		spots = spotcount;
		color = coloring;
		size = sizing;
		//possible colors: red, redorange, orange, orangeyellow, yellow, yellowgreen
		
		life_stage = stage;
		hibernating = false;
		threatened = false;
		hungry = false;
		
		
	}
	
	public char getSymbol() {
		if (life_stage == 0) return '0';
		if (life_stage == 1) return 'T';
		if (life_stage == 2) return '8';
		return 'O';
	}
	
	public void move(int dx,int dy) {
		if (xpos+dx>=0 && xpos+dx<=7) {
			xpos += dx;
		}
		if (ypos+dy>=0 && ypos+dy<=5) {
			ypos += dy;
		}
	}
	
	public void grow() {
		if (life_stage < 3) {
			life_stage++;
		}
	}
	
	public void eat() {
		if (hungry == true) {
			hungry = false;
		}
		if (life_stage == 1) {
			size++;
		}
	}
	
	public int getX() {
		return xpos;
	}
	public int getY() {
		return ypos;
	}
	
}
