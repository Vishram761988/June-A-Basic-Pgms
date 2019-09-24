package demo;

public class nonstaoverlod {
public static int demo(int a,int b)
{
System.out.println("demo");
return a+b;
}
public int demo(int c, int d,int e)
{
	System.out.println("demo");
return c+d+e;
}


public static void main(String[] args)
{
	System.out.println(nonstaoverlod.demo(60, 40));

	nonstaoverlod d=new nonstaoverlod();
	d.demo(20, 20);
	nonstaoverlod d1=new nonstaoverlod();
	System.out.println(d1.demo(20, 20,20));
	
	
}
}
