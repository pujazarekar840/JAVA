package p13;

import java.util.Collections;
import java.util.LinkedList;

public class Company {
//Generic-LinkList
	public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<>();
		a1.add("Accenture");
		a1.add("TCS");		
		a1.add("Wipro");
		a1.add("Cognizant");
		
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
