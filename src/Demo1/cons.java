package Demo1;

public class cons {
	int rollno;
	String name;
	int c,d;
	cons()
	{
	rollno=10;
	name="sagar";
	
	
	
	}
	cons(int a, String str, int e,int f)
	{
		rollno=a;
		name=str;
	     c = e;
	     d=f;
	   
		
	}
	public void test()
	{
	System.out.println("rollno is="+rollno );	
	System.out.println("name is="+name);
	
	System.out.println("No one is"+c);
	System.out.println("No one is"+d);
	int g=c+d;
    System.out.println(g);
	
	
	}
}