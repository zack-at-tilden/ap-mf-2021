package drunkardswalk_pkg;

import java.util.concurrent.TimeUnit;

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
		
		while(true){
			board.move(1,1);
			board.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
