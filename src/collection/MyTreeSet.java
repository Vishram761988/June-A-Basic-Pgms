package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyTreeSet {public static void main(String[] args) {
	TreeSet hs=new TreeSet();
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	hs.add("Aboli");
	hs.add("Vishram");
	hs.add("Mahesh");
	hs.add("Manjusha");
	hs.add("Eknath");
	hs.add("Aboli");
	//hs.add(null);
	System.out.println(hs);
	System.out.println("After Adding Elements");
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains("bama"));
	System.out.println("To Check Treeset Functionality");
	System.out.println("First elements:---"+hs.first());
	System.out.println("Last elements:--"+hs.last());
	System.out.println("Delete First elements:--"+hs.pollFirst());
	System.out.println("Delete Last elements:--"+hs.pollLast());
	hs.add("Aboli");
	hs.add("Vishram");
	System.out.println(hs);
	System.out.println("Uses Of Iterator");
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println(hs);
	//hs.clear();
	//System.out.println(hs.size());
	
	System.out.println("decending Order Iterator");
	Iterator itr1=hs.descendingIterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	//System.out.println();


}
}