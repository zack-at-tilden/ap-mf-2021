package cw_11_12_21_pkg;

public class CW_11_12_21_Main {

	public static void main(String[] args) {
		
		double x;
		x=0;
		
		double[] array1 = {1.20, 3.40, 5.60};
		double[] array2 = new double[100]; // automatically initialized to zero
		
		System.out.printf("array1[0]: %f\n",array1[0]); //1st element in array1
		System.out.printf("array1[2]: %f\n",array1[2]); //2nd element in array1
		System.out.printf("array2[0]: %f\n",array2[0]); //1st element in array2
		System.out.printf("array2[1]: %f\n",array2[1]); //2nd element in array2
		System.out.printf("x: %f\n",x);
		
		int y;
		y=1000;
		int[] array3 = new int[y];
		
		String[] array4 = {"apple","banana","coconut"};
		
		Box[] array5 = new Box[5]; // not automatically initialized
		
		array5[0]= new Box();
		
		System.out.printf("%d ",array5[0].getVolume());
		
		
		int[] array10 = {1,2,3,4};
		int[] array11 = array10;
		
		array11[0] = 100;
		
		System.out.printf("\narray10: %d array11: %d\n",array10[0],array11[0]);
		
		
		System.out.printf("Sum=%d\n",Sum.returnSum(array11));
		
	}

}
