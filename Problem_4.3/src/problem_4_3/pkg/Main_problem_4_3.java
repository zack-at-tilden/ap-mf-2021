package problem_4_3.pkg;

import javax.swing.JFrame;

public class Main_problem_4_3 {

	public static void main(String[] args) {

		Triangle tri = new Triangle(new Point(0,0),new Point(110,0),new Point(50,100));
		
		tri.displayAllLengths();
		tri.displayPerimeter();
		tri.displayArea();
		
		
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TriangleComponent component = new TriangleComponent(tri);
		frame.add(component);
		frame.setVisible(true);
		

	}

}
