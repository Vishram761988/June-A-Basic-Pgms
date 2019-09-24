package Array;

import java.util.Arrays;

public class arraysimple {
	public static void main(String[] args) {
		String ar[]=new String[5];
		//ar[0]="abc";
		//ar[1]="vmd";
		//ar[2]="vak";
		//ar[3]="nss";
		//ar[4]="rpb";
		int ar1[]= {10,85,65,02,56};
		Arrays.sort(ar1);
		
		System.out.println("assending order");
		for(int i=0;i<ar1.length;i++)
		{
		System.out.println(ar1[i]);
	}
		System.out.println("Decending Order");
		for(int i=ar1.length-1;i>=0;i--)
		{
		System.out.println(ar1[i]);
	}
			
	}
}
