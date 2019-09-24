package inheretance;

public class multi {
public static void main(String[] args) {
	son2 s2= new son2();
	s2.credit_card();
	
	s2.car();
	System.out.println("Son1 Property");
	son1 s1=new son1();
	s1.bike();
	s1.house();
}
}
