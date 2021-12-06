package sprites_pkg;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


import javax.swing.JComponent;



public class SpriteMinder extends JComponent {

	final private int OVAL_W = 20;
	final private int OVAL_H = 15;
	
	private int x,y;
	
	private int dx,dy;
	
	
	public SpriteMinder(int dx_in,int dy_in) {
		dx=dx_in;
		dy=dy_in;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D  g2 = (Graphics2D) g;
		Ellipse2D.Double oval = new Ellipse2D.Double(x, y, OVAL_W, OVAL_H);
		g2.setColor(Color.blue);
		g2.fill(oval);

	}
	
	public void update() {
		x=getWidth()/2;
		y=getHeight()/2;
	}
	
	
	public void move() {
		x+=dx;
		y+=dy;

	}
	
	public void checkBounds() {
		if (x<=0 || x>=getWidth()) dx*=-1;
		if (y<=0 || y>=getHeight()) dy*=-1;
		
	}
	

	
	/*
	public int getPtrPosition(){
		return pointPtr;
	}
	*/

}

