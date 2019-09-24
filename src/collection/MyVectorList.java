package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MyVectorList {
public static void main(String[] args) {
	Vector vl=new Vector();
	System.out.println(vl.capacity());
	System.out.println(vl.isEmpty());
	System.out.println(vl.size());
	vl.add(36);
	vl.add("Vijay");
	vl.add('M');
	vl.add(null);
	vl.add("Vijay");
	
	System.out.println("After add Element");
	System.out.println(vl);
	System.out.println(vl.isEmpty());
	System.out.println(vl.size());
	System.out.println(vl.indexOf('M'));
	System.out.println(vl.lastIndexOf("Vijay"));
	System.out.println(vl.contains(36));
	vl.add(0,60);
	System.out.println(vl.get(0));
	System.out.println(vl);
	vl.set(2, "Vishram");
	System.out.println(vl.get(2));
	System.out.println(vl);
	vl.remove(4);
	System.out.println(vl);
	Enumeration en=vl.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
		System.out.println();
		System.out.println(vl);
	}
	Collections.reverse(vl);
	Enumeration en2=vl.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en2.nextElement());
//		System.out.print(false);
		System.out.println(vl);
	}
	
	
}
}
