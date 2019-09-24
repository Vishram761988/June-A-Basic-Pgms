package Demo1;

public class Example2 {
public static void main(String[] args) 
{
	float r=2.5F;
	float p=3.14F;
	float c;
	c= p*r*r;
	System.out.println("If radius of cicle is "+r+" mtr");
	System.out.println("Then Area of circle is "+c+" sq.mtr");
    student(); 
}
public static void student()
{
	String sName;
	int sRollNo;
	char sGrade;
	float percentage;
	// Initialization
	sName = "ABC";
	sRollNo = 100;
	sGrade = 'A';
	percentage = 60.6F;

	// Usage
	System.out.println("Student Name is "+sName);
	System.out.println("Student Roll No is "+sRollNo);
	System.out.println("Student Grade is "+sGrade);
	System.out.println("Student percentage is "+percentage+'%');
}
}

