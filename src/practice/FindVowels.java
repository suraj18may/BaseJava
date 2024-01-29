package practice;

public class FindVowels {

public static void main(String[] args) {

	String S="wellcome";
	
	if(S.contains("a") || S.contains("e") || S.contains("i") || S.contains("o")  || S.contains("u")  )
	{
		System.out.print(true);
	}
	else
	{
		System.out.print(false);
	}
}
}
