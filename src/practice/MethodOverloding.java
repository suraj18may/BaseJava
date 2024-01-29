package practice;

public class MethodOverloding {
	
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	void add(int a,int b,int c)
	{
		
	}
	public static void main(String[] args) {
		MethodOverloding mo=new MethodOverloding();
		mo.add();
		 int add=mo.add(20,30);
		System.out.println(add);
		
	}

}
