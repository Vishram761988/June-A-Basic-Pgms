package Demo1;

public class superr
{

int b=30;
}
class duper extends superr
{
int b=35;
public void god()
{
	int b=40;
	System.out.println(b);
	System.out.println(this.b);
	System.out.println(super.b);
}
}