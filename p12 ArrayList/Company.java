package p12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Company {
//Generic-ArrayList
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
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
        LinkedList a2=new LinkedList();
    	a2.addAll(a1);//addAll use for copy
    	System.out.println("a2="+a2);
	}
	

}
