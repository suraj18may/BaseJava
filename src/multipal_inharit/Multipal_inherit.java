package multipal_inharit;
import java.io.*;

interface  Multipal_inherit1 {

int i=20;
	 void fun();
}

interface Multipal_inherit2 {

	void fun();
}

class Test implements Multipal_inherit1,Multipal_inherit2 {


	public void fun() {
	 System.out.println("1");

	}
	public void fun1() {
		 System.out.println("2");

		}
	
}	
public class  Multipal_inherit{
public static void main(String args[]) {

	Multipal_inherit1 t = new Test();
	t.fun();
//	t.fun1();
	System.out.println(Multipal_inherit1.i);
}
}

