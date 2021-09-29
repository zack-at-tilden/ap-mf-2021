package problem_4_3.pkg;

public class Triangle {
	
	//object variables
	Point p1,p2,p3;
	Double l12,l23,l31;
	Double peri;
	Double area;

	//object constructor
	public Triangle(Point p1_in,Point p2_in,Point p3_in) {
		p1 = p1_in;
		p2 = p2_in;
		p3 = p3_in;
		l12 = p1.getDistance(p2);
		l23 = p2.getDistance(p3);
		l31 = p3.getDistance(p1);
		peri = l12+l23+l31;
		double s = peri/2.0;
		area = Math.sqrt(s*(s-l12)*(s-l23)*(s-l31));
			
	}
	
	//object methods
	public void displayAllLengths() {
		System.out.printf("Length 1: %.2f, Length 2: %.2f, Length 3: %.2f\n", l12, l23, l31);
	}
	
	public void displayPerimeter() {
		System.out.printf("Perimeter: %.2f\n",peri);
	}

	public void displayArea() {
		System.out.printf("Area: %.2f\n",area);
	}
	
	public Point [] getPoints() {
		Point [] points = {p1,p2,p3};
		return points;
	}
}
