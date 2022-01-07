package p15;

import java.util.ArrayList;
import java.util.HashSet;

public class A {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		HashSet<String>m1=new HashSet<String>();
		m1.add("MV1");
		m1.add("MV2");
		m1.add("MV3");
		
		a1.add(new Director("ABC",30,m1));
		System.out.println(a1);
		
		

	}

}
