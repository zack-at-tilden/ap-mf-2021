package second_project_pkg;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;



public class Second_Project_Main {
	final static int WINDOW_W = 600;
	final static int WINDOW_H = 400;
	
	//main method
	public static void main(String[] args) {
		// comment
		JFrame frame = new JFrame();
		frame.setSize(WINDOW_W,WINDOW_H);
		frame.setTitle("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicComponent component = new GraphicComponent(1,1);
		frame.add(component);
		
		
		frame.setVisible(true);
		
		while(true) {
			component.move();
//			component.dumpValues();
			component.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
