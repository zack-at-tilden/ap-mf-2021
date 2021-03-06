package sprites_pkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


import javax.swing.JComponent;



public class SpriteComponent extends JComponent {

	final private int OVAL_W = 20;
	final private int OVAL_H = 15;
	
	
	private int x,y;
	private int x2,y2;
	
	private int dx,dy;
	private int dx2,dy2;
	
	
	public SpriteComponent(int dx_in,int dy_in) {
		dx=dx_in;
		dy=dy_in;
		dx2=-dx_in;
		dy2=-dy_in;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D  g2 = (Graphics2D) g;
		Ellipse2D.Double oval = new Ellipse2D.Double(x, y, OVAL_W, OVAL_H);
		g2.setColor(Color.red);
		g2.fill(oval);
		Ellipse2D.Double oval2 = new Ellipse2D.Double(x2,y2,OVAL_W,OVAL_H);
		g2.setColor(Color.blue);
		g2.fill(oval2);

	}
	
	public void update() {
		x=getWidth()/2;
		y=getHeight()/2;
	}
	
	
	public void move() {
		x+=dx;
		y+=dy;
		x2+=dx2;
		y2+=dy2;

	}
	
	public void checkBounds() {
		if (x<=0 || x>=getWidth()) dx*=-1;
		if (y<=0 || y>=getHeight()) dy*=-1;
		if (x2<=0 || x2>=getWidth()) dx2*=-1;
		if (y2<=0 || y2>=getHeight()) dy2*=-1;
		
	}
	

	
	/*
	public int getPtrPosition(){
		return pointPtr;
	}
	*/

}
