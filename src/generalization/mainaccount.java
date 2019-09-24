package generalization;

public class mainaccount {
   public static void main(String[] args) {
	System.out.println("CURRENT ACCOUNT DETAILS");
   current c1 =new current();
   c1.cuurentbal();
   c1.ministmt();
   c1.withdraw();
   c1.transfer();
   System.out.println();   
   System.out.println("SAVING ACCOUNT DETAILS");
   saving c2 =new saving();
   c2.cuurentbal();
   c2.ministmt();
   c1.withdraw();
   c2.transfer();
}
}