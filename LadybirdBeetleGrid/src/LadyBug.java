//possible variables: xpos, ypos, spots, color scaling, size, hibernating?, life stage, threatened?, hungry?
public class LadyBug {

	int xpos, ypos, spots, life_stage;
	boolean hibernating, threatened, hungry;
	double size;
	String color;
	
	public LadyBug(int x,int y,int spotcount,String coloring,double sizing) {
		xpos = x;
		ypos = y;
		spots = spotcount;
		color = coloring;
		size = sizing;
		//possible colors: red, redorange, orange, orangeyellow, yellow, yellowgreen
		
		life_stage = 0;
		hibernating = false;
		threatened = false;
		hungry = false;
		
		
	}
	
	public void move(int dx,int dy) {
		xpos += dx;
		ypos += dy;
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
