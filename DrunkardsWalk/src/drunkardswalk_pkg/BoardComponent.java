package drunkardswalk_pkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


import javax.swing.JComponent;

public class BoardComponent extends JComponent {
	
	private static final int ARRAYLENGTH = 10000;
	
	private int x, y;
	private int box_size = 5;
	
	private int[] xPoints = new int[ARRAYLENGTH];
	private int[] yPoints = new int[ARRAYLENGTH];
	private int pointPtr = 0;
	
	
	public BoardComponent() {
		//do nothing constructor
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D  g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(x, y, box_size, box_size);
		g2.fill(box);
		g2.drawPolyline(xPoints,yPoints,pointPtr);
	}
	
	public void update() {
		x=getWidth()/2;
		y=getHeight()/2;
	}
	
	private void updateArray() {
		xPoints[pointPtr]=x;
		yPoints[pointPtr]=y;
		pointPtr++;
	}
	
	public void move(int dx, int dy) {
		x+=dx;
		y+=dy;
		updateArray();
	}
	
	public boolean outOfBounds() {
		//System.out.printf("(%d,%d)\n",x,y);
		if (x>getWidth() || x<0) return true;
		if (y>getHeight() || y<0) return true;
		if (pointPtr==ARRAYLENGTH) return true;
		return false;
	}
	
	public int getPtrPosition(){
		return pointPtr;
	}

}
