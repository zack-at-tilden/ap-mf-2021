package second_project_pkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;



public class GraphicComponent extends JComponent{
	
	//object variables
	private int [] x = {0,10,20};
	private int [] y = {0,20,0}; 
	
	private int oval_x = 150;
	private int oval_y = 100;
	private int oval_width = 20;
	private int oval_height = 10;
	
	private int dx, dy;
	private int odx, ody;
	
	private Rectangle rec_T = new Rectangle(0,0,x[2]-x[0],y[1]-y[0]);
	private Rectangle rec_O = new Rectangle(0,0,oval_width,oval_height);
	
	//object constructor
	public GraphicComponent(int dx_in, int dy_in, int odx_in, int ody_in) {
		dx = dx_in;
		dy = dy_in;
		odx = odx_in;
		ody = ody_in;

	}

	//object methods
	public void paintComponent(Graphics g) {		
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.RED);
		g2.fillPolygon(x, y, 3);
		
		g2.setPaint(Color.BLUE);
		g2.fillOval(oval_x, oval_y, oval_width, oval_height);
	}
	
	public void move() {
		if (x[0] < 0 || x[2] > getWidth()) {
			dx*=-1;
		}
		if (y[0] < 0 || y[1] > getHeight()) {
			dy*=-1;
		}
		for (int i=0; i<3; i++) {
			x[i]+= dx;
			y[i]+= dy;
		}
		rec_T.x=x[0];
		rec_T.y=y[0];
		
		if (oval_x < 0 || oval_x + oval_width > getWidth()) {
			odx*=-1;
		}
		if (oval_y < 0 || oval_y + oval_height > getHeight()) {
			ody*=-1;
		}
		oval_x+=odx;
		oval_y+=ody;
		
		rec_O.x=oval_x;
		rec_O.y=oval_y;
	}
	
	public void checkCollision() {
		if (rec_T.intersects(rec_O)){
			dx*=-1;
			dy*=-1;
			odx*=-1;
			ody*=-1;
		}
	}
}
