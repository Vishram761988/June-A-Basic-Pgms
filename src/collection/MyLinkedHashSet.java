package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add("Aboli");
		hs.add("Vishram");
		hs.add("Mahesh");
		hs.add("Manjusha");
		hs.add("Eknath");
		hs.add("Aboli");
		hs.add(null);
		try
		{
			hs.add(null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(hs);
		System.out.println("After Adding Elements");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("bama"));
		System.out.println(hs.add("Abhiram"));
		System.out.println(hs);
		
		System.out.println("Uses Of Iterator");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs);
		//hs.clear();
		System.out.println(hs.size());

}
}