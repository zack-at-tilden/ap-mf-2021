package sprites_pkg;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import java.util.Random;
import java.awt.event.WindowEvent;


public class Sprites_Main {
	

	public static void main(String[] args) {
		JFrame  frame = new JFrame();
		frame.setSize(1600,800);
		frame.setTitle("Sprites");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpriteComponent board = new SpriteComponent(1,1);

		frame.add(board);

		frame.setVisible(true);

		board.update();

		
		Random r = new Random();
		int dx,dy;
		int counter=0;
		dx=1;
		dy=1;
		
		
		while(true){

			board.checkBounds();

			board.move();

			board.repaint();

			try {
				TimeUnit.MILLISECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		System.out.printf("Out of bounds!\n");
//		System.out.printf("Pointer @ %,d!\n", board.getPtrPosition());
/*		try {
			TimeUnit.MILLISECONDS.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
*/
	}
}
