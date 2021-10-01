package second_project_pkg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



public class GraphicComponent extends JComponent{
	
	//object variables
	int [] x = {0,50,100};
	int [] y = {0,200,0}; 
	
	//object constructor
	public GraphicComponent() {
	}

	//object methods
	public void paintComponent(Graphics g) {		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawPolygon(x, y, 3);
	}
	
	
	public void move(int dx, int dy) {
		for (int i=0; i<3;i++) {
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
