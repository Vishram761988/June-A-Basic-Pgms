package execption;

public class arrayexp {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
//			a[0] = 10;
//			a[1] = 65;
//			a[2] = 58;
//			a[3] = 23;
//			a[4] = 47;
			a[5] = 85;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Array Index Out Of Bounds Exception ");
		}
	}
}