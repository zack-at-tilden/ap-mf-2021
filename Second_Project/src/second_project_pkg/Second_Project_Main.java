package second_project_pkg;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;



public class Second_Project_Main {

	
	//main method
	public static void main(String[] args) {
		// comment
		JFrame frame = new JFrame();
		frame.setSize(600,400);
		frame.setTitle("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphicComponent component = new GraphicComponent();
		frame.add(component);
		
		
		frame.setVisible(true);
		
		while(true) {
			component.move(1,1);
//			component.dumpValues();
			component.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
