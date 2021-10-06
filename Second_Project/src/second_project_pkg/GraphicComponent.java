package second_project_pkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



public class GraphicComponent extends JComponent{
	
	//object variables
	private int [] x = {0,50,100};
	private int [] y = {0,100,0}; 
	
	private int dx, dy;
	
	//object constructor
	public GraphicComponent(int dx_in, int dy_in) {
		dx = dx_in;
		dy = dy_in;
	}

	//object methods
	public void paintComponent(Graphics g) {		
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.RED);
		g2.fillPolygon(x, y, 3);
	}
	
	public void move() {
		if (x[0] < 0 || x[2] + 20 > Second_Project_Main.WINDOW_W) {
			dx*=-1;
		}
		if (y[0] < 0 || y[1] + 35 > Second_Project_Main.WINDOW_H) {
			dy*=-1;
		}
		for (int i=0; i<3; i++) {
			x[i]+= dx;
			y[i]+= dy;
		}
	}
	/*
	public void dumpValues() {
		for (int val: x) {
			System.out.printf("%d ",val);
		}
		for (int val: y) {
			System.out.printf("%d ",val);
		}
		System.out.printf("\n");
	}
	*/
}
