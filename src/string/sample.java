package string;

public class sample {
public static void main(String[] args) {
	String s1="velocity";
	String s2="vishram";
	String s3="abcd";
	String s4="ABCD";
	String s5="abcd  ef  gh";
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.startsWith("v"));
	System.out.println(s1.endsWith("y"));
	System.out.println(s1.indexOf("t"));
	System.out.println(s1.lastIndexOf("l"));
	System.out.println(s1.charAt(7));
	System.out.println(s1.length());
	System.out.println(s1.isEmpty());
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,8));
	System.out.println("to check equal;-"+s3.equals(s4));
	System.out.println(s3.equalsIgnoreCase(s4));
	System.out.println(s4.split(s4));
	System.out.println(s4.concat(s2));
	System.out.println(s4.contains(s2));
	System.out.println(s2.replace("v", "m "));
	
}
}
