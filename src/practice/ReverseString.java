package practice;

import java.lang.reflect.Method;

public class ReverseString {
	public static void main(String[] args) {
		
	
	String s="Mrinal mishra";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print( s.charAt(i) );
	}
	
	
//	Method---------StringBuffer
	StringBuffer sb=new StringBuffer(s);
	System.out.println("   "+sb.reverse());

}
}