package execption;

public class numberexcp {
	public static void main(String[] args) {
		try
		{
			//sagar is not number
			int num=Integer.parseInt("sagar");
			System.out.println(num);
			
			
		}
		catch(NumberFormatException e)
		{
			//e.printStackTrace();
			System.out.println("Number  Format Exception Handle");
		}
	}

}
