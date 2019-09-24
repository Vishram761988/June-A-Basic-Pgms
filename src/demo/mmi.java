package demo;

public class mmi {
	public static void main(String[] args) {
		System.out.println("********running main method************");
		System.out.println("INFOSYS SOFTWARE PVT LTD");
		System.out.println("************running static methode*********");
		cm();
		System.out.println("************running non static methode*****");
		mmi hi = new mmi();
		hi.me();
		System.out.println("************ending main method **********   ");
	}

	public static void cm() {
		int eId;
		String eName;
		String eDept;
		float eSalary;
		float experince;
		// Initialization
		eId = 12;
		eName = "Pravin";
		eDept = "Testing";
		eSalary = 51530.50F;
		experince = 3.5F;
		// Usage
		System.out.println("Employee Id id " + eId);
		System.out.println("Employee Name is " + eName);
		System.out.println("Employee Dept is " + eDept);
		System.out.println("Employee Salary is " + eSalary);
		System.out.println("Employee Experince is " + experince);

	}

	public void me() {
		int a = 77;

		if (a % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");

	}
}
