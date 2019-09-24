package Demo1;

abstract public class abstrac {
public void test()
{
	int a=10;
	int b=20;
	int c=a+b;;
	
	System.out.println("addition="+c);
}
abstract public void test1();
}
class demo extends abstrac
{
	public void test1()
	{
		System.out.println("Test 1");
	}
}
