package practice;

public class blocks {


	static {
		System.out.println("static Block executed");
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
blocks()
{
	System.out.println("constructor executed");
}
}
