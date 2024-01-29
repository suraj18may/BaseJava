package practice;

public class Constratoroverloding {
	int x;
	Constratoroverloding()
	{
		System.out.println("this a default constructor");  
	}
	Constratoroverloding(int a,int b)
	{
		System.out.println(a+b);
	}
	Constratoroverloding(int a,int b,int c)
	{
	     x=a+b+c;
	}
	
	public static void main(String[] args) {
		Constratoroverloding cs=new Constratoroverloding();
		Constratoroverloding cs1=new Constratoroverloding(20,30);
		Constratoroverloding cs2=new Constratoroverloding(20,30,50);
		
		System.out.println(cs2.x);
		
		
		
	}

}
