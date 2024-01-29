package practice;

public class Largeno {
	public static void main(String[] args) {
				int a=30;
				int b=20;
		//		int large=a>b?a:b;
		//		System.out.println(large);
				 if(a>b)
				 {
					 System.out.println("larger"+a);
				 }
				 else {
					 System.out.println("smaller"+b);
				 }
		


		String s="WellCome To AutomatioN";
		int lower=0;
		int larger=0;
		for (int i=0; i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch>=65 && ch<=90)
			{
				larger++;
			}
			else
			{
				lower++;
			}
		} 
		System.out.println(larger);
		System.out.println(lower);
	}

}
