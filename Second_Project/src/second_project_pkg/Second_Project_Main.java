package second_project_pkg;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;



public class Second_Project_Main {
	final static int WINDOW_W = 600;
	final static int WINDOW_H = 400;
	
	final static int SPEED = 3;
	final static int SPEED2 = 4;
	
	//main method
	public static void main(String[] args) {
		// comment
		JFrame frame = new JFrame();
		frame.setSize(WINDOW_W,WINDOW_H);
		frame.setTitle("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicComponent component = new GraphicComponent(SPEED,SPEED,SPEED2,SPEED2);
		frame.add(component);
		
		
		frame.setVisible(true);
		
		while(true) {
			component.move();
			component.checkCollision();
			component.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
