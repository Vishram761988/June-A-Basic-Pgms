package Demo1;

public class conss {
	public static void main(String[] args) {
		System.out.println(" non Parameterized Constructor");

		cons c1=new cons();
		c1.test();
	
		System.out.println(" Parameterized Constructor");
		cons c2=new cons(50,"santosh",20,20);
	c2.test();
	
	}

}
