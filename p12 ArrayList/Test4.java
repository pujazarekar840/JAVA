package p12;

import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
//Generic List For city (String)
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
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


