package demo;

public class example1 {
	public static void main(String[] args) {
		int a = 1000;
		int b = 900;
		int c = 800;

		if (a > b) {
			if (a > c) {
				System.out.println("Largest No is " +a +" Among " +a+","+b+","+c);
			}
			else
				System.out.println(c);
		}
		else
				if (b > c) {
				System.out.println(b);
			}
				else
		System.out.println(c);
		
	}
}
