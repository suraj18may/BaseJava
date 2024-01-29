package Array;

import java.util.Arrays;

public class Max_Min_Array {

	public static void main(String[] args) {
		int[] ar= {2,3,87,456,5,7,66,88,99,656};
		
//		Method   1
//		Arrays.sort(ar);
//		System.err.println("min: "+ar[0]+"   "+"max: "+ar[ar.length-1]);
		
		
		
//		Method 2
		int max=ar[0];
		int min=ar[0];
		for (int i=0; i<ar.length;i++) {
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.err.println("max:"+max+" "+"min:"+min);
	}
}
