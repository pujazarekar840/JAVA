package p17;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Demo4 {

	public static void main(String[] args) {
		//key has to be unique
		//unordered
		//unsorted
		HashMap h1=new HashMap();
		h1.put(1,"Neha");
		h1.put(4,"Priya");
		h1.put(3,"Soham");
		h1.put(3,"Joy");
		h1.put(41,null);
		h1.put(31,null);
		h1.put(null,"Aniket");
		System.out.println(h1);
		
		//thread safe
		//1.0v / legacy class
		//null key and null value not allowed
		Hashtable ht1=new Hashtable();
		ht1.put(1,"Neha");
		ht1.put(4,"Priya");
		ht1.put(3,"Soham");
		ht1.put(3,"Nihal");
		ht1.put(41,"Lily");
		ht1.put(31,"John");
		ht1.put(2,"Aniket");
		System.out.println(ht1);
		
		//sort by key
		//no null key
		//can contain null value
		TreeMap m1=new TreeMap();
		m1.put(2, 30);
		m1.put(3, 60);
		m1.put(4, 90);
		m1.put(1, 70);
		m1.put(5, 80);
		m1.put(8, null);
		System.out.println(m1);
	}

}
