package cw_11_15_21_pkg;




public class CW_11_15_21_Main {

	private static int[] array1 = new int[100];
	
	public static void main(String[] args) {
		
		
	System.out.printf("%d\n",array1[0]);
	
	
	MyClass object = new MyClass();
	object.MyMethod();
	
	int ptr=0;
	for (int element : array1) {
		array1[ptr] = ptr++;
	}
	
	
	for (int element : array1) {
		System.out.printf("%d ", element);
	}
	System.out.println();
	
	object.MyMethod2();
	
  }

}
