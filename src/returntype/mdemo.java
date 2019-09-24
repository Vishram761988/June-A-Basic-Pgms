package returntype;

public class mdemo {
	public static void main(String[] args) {
		method m1=new method();
		int str = m1.add(10, 20);
		int str1 = m1.mul(str,25);
		System.out.println(str);
		System.out.println(str1);
	}

}
