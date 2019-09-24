package practice;

public class demo {
	static {
		System.out.println("ststic Block executed");
	}
	{
		System.out.println("non static block executed");
	}
public  static  void  test()
{
	System.out.println("static method executed");
}
public void test1()
{
	System.out.println("Non Static Method executed");
}
demo()
{
	System.out.println("constructor executed");
}
public static void main(String[] args) {
	test();
	demo d1=new demo();
	d1.test1();
	
	System.out.println("again executed");
	demo d2=new demo();
	d2.test1();
}
}
