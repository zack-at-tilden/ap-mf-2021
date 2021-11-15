package cw_11_12_21_pkg;

public class Sum {
	
	
	public static int returnSum(int[] array_to_sum) {
		int sum=0;
		for (int i=0;i<array_to_sum.length;i++) {
			sum+= array_to_sum[i];
		}
		return sum;
	}
	

	
	
	
}
