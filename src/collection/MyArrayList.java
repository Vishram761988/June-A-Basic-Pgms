package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
public void test()
{
	ArrayList al=new ArrayList();
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	al.add("ABC");
	al.add(20);
	al.add('f');
	al.add(null);
	al.add("ABC");
	System.out.println(al);
	System.out.println("-----after adding element----");
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	System.out.println(al.indexOf('f'));
	System.out.println("add element");
	al.add(2,"xyz");
	System.out.println(al.get(2));
	System.out.println(al.get(3));
	System.out.println(al);
	System.out.println("update the element");
	al.set(2, 100);
	System.out.println(al.get(2));
	System.out.println(al);
	System.out.println("remove element");
	System.out.println(al.remove(1));
System.out.println(al.contains('n'));
	System.out.println(al); 
	Iterator itr=al.iterator();
	while  (itr.hasNext())
	{
		System.out.println(itr.next());
		System.out.println();
	}
	System.out.println(al);

}
	public static void main(String[] args) {
		MyArrayList l=new MyArrayList();
		l.test();
		
		
		
	}
}
