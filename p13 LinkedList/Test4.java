package p13;
//LinkedList

import java.util.Collections;
import java.util.LinkedList;

public class Test4 {
//Generic List For city (String)
	public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<>();
		a1.add("pune");
		a1.add("Aurangabad");		
		a1.add("Jalna");
		a1.add("Beed");
		
		System.out.println("Before sort -");
		for(Object x:a1) {
			System.out.println(x);
		}
		System.out.println("*********************");
		System.out.println("After sort -");
        Collections.sort(a1);
        for(Object x:a1) {
			System.out.println(x);
		}
	}


		

}


