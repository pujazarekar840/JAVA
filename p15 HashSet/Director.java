package p15;

import java.util.Collections;
import java.util.HashSet;

import p12.A;

public class Director {
	String name;
	int age;
	HashSet<String>movies;
	public Director() {
		name="RajMauli Sir";
		age=40;
	}
	public Director(String nm,int a,HashSet<String>hs) {
		name=nm;
		age=a;
		movies=hs;
	}
   public String toString() {
	   return name+" "+age+" "+movies;
   }
   
		

	

}
