package demo;

public class abcc {
int b=20;
public void test()
{
	int b=40;
	System.out.println(b);
	System.out.println(this.b);
}

public static void main(String[] args) {
	abcc c1=new abcc();
	c1.test();
}}
