package drunkardswalk_pkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class BoardComponent extends JComponent {
	
	
	private int x,y;
	private int box_size = 5;
	
	public BoardComponent() {
		//do nothing constructor
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D  g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(x,y,box_size,box_size);
		g2.fill(box);
	}
	
	public void update() {
		x=getWidth()/2;
		y=getHeight()/2;
	}
	
	public void move(int dx, int dy) {
		x+=dx;
		y+=dy;
	}

}
