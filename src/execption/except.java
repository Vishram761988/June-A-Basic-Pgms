package execption;

public class except {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try
	{
		int c =a/b;
		System.out.println(c);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException Handle");
	}
	catch (Exception e)
	{
		e.printStackTrace();
		System.out.println("Generic Exception hanle");
	}
//catch (ArithmeticException e )
//	{
//	//e.printStackTrace();
//	System.out.println("exception handle");
//	}
	System.out.println("hello");
}
}
