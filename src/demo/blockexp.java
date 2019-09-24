package demo;

public class blockexp {
static {
	System.out.println("static block");
}
{
	System.out.println("non static block");
}
blockexp()
{
	System.out.println("constructor call");
}
public static void test() {
	System.out.println("Static Method");
}
public void test1() {
	System.out.println("Non Static Method");
}
public static void main(String[] args) {
	
	
    // blockexp e=new blockexp();
	//e.test1();
	//test();
	//blockexp e1=new blockexp();
	//e1.test1();

}
}