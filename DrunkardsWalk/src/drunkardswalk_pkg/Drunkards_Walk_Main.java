package drunkardswalk_pkg;

import java.util.concurrent.TimeUnit;
import java.util.Random;
import javax.swing.JFrame;


public class Drunkards_Walk_Main {
	

	public static void main(String[] args) {
		JFrame  frame = new JFrame();
		frame.setSize(600,600);
		frame.setTitle("Drunkards Walk");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoardComponent board = new BoardComponent();
		frame.add(board);
		
		frame.setVisible(true);

		board.update();
		
		Random r = new Random();
		int dx,dy;
		
		while(!board.outOfBounds()){
			dx=3-r.nextInt(7);
			dy=3-r.nextInt(7);
			
			board.move(dx,dy);
			board.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("Done!");
	}

}
