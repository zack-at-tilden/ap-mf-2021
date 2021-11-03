import java.util.Random;



public class CW_11_3_21_Main {

	public static void main(String[] args) {

		
		for (int i = 0; i<10; i++) {
			for (int j = 0; j<10; j++) {
				System.out.printf("%d %d    ", i,j);
			}
			System.out.printf("\n");
		}
		
		
		int[] array = {0,0,0,0,0,0};
		
		Random generator = new Random();
		for (int i = 0; i<6000;i++) {
			int die = 1 + generator.nextInt(6);
			System.out.printf("%d ",die);
			array[die-1]+=1;
		}
		
		//System.out.printf("\n\n");

		for (int e : array) {
			System.out.printf("%d ",e);

		}
		
		System.out.printf("\n");
		
		int c=1;
		for (int i = 0; i<100; i++) {
			System.out.printf("%f %s", generator.nextDouble(),c++%10==0?"\n":"");
		}
		
	}	
	
}
