package practice;

public class FindVowelConsonent {

	public static void main(String[] args) {
		
		System.out.println("print vowels and cons");

		String S="wellcome to java";
		String vowels="";
		String cons="";
		
		for (int i=0;i<=S.length()-1;i++)
		{
			char ch=S.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i' || ch=='o'  || ch=='u'  )

			{
				vowels=vowels+ch;
				System.out.print(ch);  //right like this also

			}
			else
			{
				cons=cons+ch;
			}
		}
		System.out.println(vowels);
		System.out.println(cons);
		
	System.out.println("count of vowesl and cons");	
		String S1="wellcome to java";
		int vowels1 = 0;
		int cons1 = 0;
		
		for (int i=0;i<=S.length()-1;i++)
		{
			char ch=S1.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i' || ch=='o'  || ch=='u'  )

			{
				vowels1++;

			}
			else
			{
				cons1++;
			}
		}
		System.out.println(vowels1);
		System.out.println(cons1);
	}
}
