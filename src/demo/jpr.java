package demo;

public class jpr {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Running Static Main Method Stated from Diffrent Class ");
		subclass.test();
		System.out.println("Running Non Static Main Method Stated from Diffrent Class ");
		subclass abc = new subclass();
		abc.test1();
		System.out.println("Main Method End");
	}

}
