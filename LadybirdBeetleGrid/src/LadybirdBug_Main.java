import java.util.ArrayList;

public class LadybirdBug_Main {

	public static void main(String[] args) {
		char[][] grid = new char[6][8];
		for (int i = 0; i<6; i++) {
			for (int j = 0; j<8; j++) {
				grid[i][j] = '-';
			}
		}
		ArrayList<LadyBug> ladybugs = new ArrayList<LadyBug>();
		
		LadyBug b = new LadyBug(0,0,6,"red",10);
		ladybugs.add(b);
		grid[ladybugs.get(0).getX()][ladybugs.get(0).getY()] = 'O';
		
		ArrayList<LadybugAphid> aphids = new ArrayList<LadybugAphid>();
		
		LadybugAphid a = new LadybugAphid(0,7,"green",5);
		aphids.add(a);
		grid[aphids.get(0).getX()][aphids.get(0).getY()] = '*';
		
		for (int i = 0; i<6; i++) {
			for (int j = 0; j<8; j++) {
				System.out.printf("%c ",grid[i][j]);
			}
			System.out.println();
		}

	}

}
