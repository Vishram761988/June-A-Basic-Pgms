package logical;

public class palindron {
	public static void main(String[] args) {
		String s = "vishram";
		//String s2 = "Aboli";
		String r = "";
		int length = s.length();
		System.out.println(length);
		for (int i = s.length() -1; i >= 0; i--) {
			r = r + s.charAt(i);
			System.out.println(r);
		}
		if (r.equalsIgnoreCase(s)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
