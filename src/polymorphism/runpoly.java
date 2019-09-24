package polymorphism;

public class runpoly {
	public void father()
	{
		System.out.println("100");
	}
}
class son extends runpoly
{
	public void father()
	{
		System.out.println("50");
	}
}
