package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add("Aboli");
		hs.add("Vishram");
		hs.add("Mahesh");
		hs.add("Manjusha");
		hs.add("Eknath");
		hs.add("Aboli");
		hs.add(null);
		System.out.println(hs);
		
		
		System.out.println("After Adding Elements");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("bama"));
		System.out.println("Uses Of Iterator");
        
		hs.add("Vak");


System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs);
		hs.clear();
		System.out.println(hs.size());
		}
	}


