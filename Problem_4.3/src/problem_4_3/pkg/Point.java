package problem_4_3.pkg;

public class Point {
	
	//object variables
	int x,y;
	
	//object constructor
	public Point(int x_in, int y_in) {
		x = x_in;
		y = y_in;
	}
	
	//object methods
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public double getDistance(Point pt) {
		//distance formula [(x1-x2)^2 + (y1-y2)^2]^(1/2)
		return Math.sqrt( Math.pow(pt.getX()-this.x, 2) + Math.pow(pt.getY()-this.y, 2) );
	}
}
