package Demo1;

public class Example {
	public static void main(String[] args) {
		int a = 180;
		int b = 250;
		int c = 3000;
		if (a > b) 
		{
			if (a > c) {
				System.out.println(a);
			}
		} 
		else if (b > c) 
		{
			System.out.println(b);
		} 
		else
			System.out.println(c);
	}
}
