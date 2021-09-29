package problem_4_3.pkg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



public class TriangleComponent extends JComponent{
	
	//object variables
	int [] x = {0,0,0};
	int [] y = {0,0,0}; 
	
	//object constructor
	public TriangleComponent(Triangle tri) {
		loadValues(tri);
	}

	//object methods
	private void loadValues(Triangle tri) {
		Point [] points = tri.getPoints();
		int i = 0;
		for (Point p: points) {
			System.out.printf("pX:%d pY:%d\n", p.getX(),p.getY());
			x [i] = p.getX();
			y [i++] = p.getY();
		}
	}
	
	public void paintComponent(Graphics g) {		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawPolygon(x, y, 3);
	}
	
}
