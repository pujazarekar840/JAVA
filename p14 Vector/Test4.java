package p14;
//Vector

import java.util.Collections;

import java.util.Vector;

public class Test4 {
//Generic List For city (String)
	public static void main(String[] args) {
		Vector<String> a1=new Vector<>();
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


