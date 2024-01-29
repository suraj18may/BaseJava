package practice;

public class FindOddEven {
	public static void main(String[] args) {
		
	
	int [] a= {2,7,6,4,3,9,3,9,45,67,44,32};
	int even=0;
	int odd=0;
	for (int i=0;i<=a.length-1;i++)
	{
		
		if (a[i]%2==0)
		{
			even++;
			System.out.println(a[i]);
		}
		else
		{
			odd++;
		}
	}
	System.out.println(even);
	System.out.println(odd);
}
}