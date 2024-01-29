package practice;

public class VowelCounts {
	public static void main(String[] args) {

		String s="Wellcome to Automation";
		s= s.toLowerCase();    

		int countV=0;
		int countC=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				countV++;
			}
			else if(s.charAt(i)>'a' &&  s.charAt(i)<'z')
				{
					countC++;
				}
			
		}
		System.out.print(countV +"    ");
		System.out.print(countC);
	}

}
