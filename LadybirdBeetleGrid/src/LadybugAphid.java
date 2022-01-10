
public class LadybugAphid {

	int xpos, ypos;
	double size;
	String color;
	
	//possible colors: green, yellow, red, black
	public LadybugAphid(int x,int y,String coloring,double sizing) {
		xpos = x;
		ypos = y;
		color = coloring;
		size = sizing;
	}
	
	public void move(int dx,int dy) {
		xpos += dx;
		ypos += dy;
	}
	
	public int getX() {
		return xpos;
	}
	public int getY() {
		return ypos;
	}
}	

