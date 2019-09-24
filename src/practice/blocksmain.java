package practice;

public class blocksmain {
	
public static void main(String[] args) {
	blocks.test();
	
	//System.out.println("Non Static Blocks Executed");
	blocks b1=new blocks();
	b1.test1();
	System.out.println("-------Repeat Once again----------");
	blocks.test();

	blocks b2=new blocks();
	b2.test1();
}
}
