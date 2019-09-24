package casting;

public class maincasting {
	
	public static void main(String[] args) {
	System.out.println("upcating");	
	father f1=new son();
		f1.car();
		f1.house();
		f1.money();
	System.out.println("downcasting");
	son s1=new son();
	s1.bike();
	s1.car();
	s1.money();
	s1.house();
	}
}
