package execption;

public class stringexcp {
public static void main(String[] args) {
	try
	{
		String a="This Is Like Chipping ";
		char c =a.charAt(27);
		System.out.println(c);
		
	}
	catch(StringIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	System.out.println("String Index Out Of Bounds Exception");
	}
	
}
}
