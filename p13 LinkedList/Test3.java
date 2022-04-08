package p13;

//LinkedList
import java.util.Collections;
import java.util.LinkedList;

public class Test3 {
//GenericList Float Type
	public static void main(String[] args) {
		LinkedList<Float> a1=new LinkedList<>();
		a1.add(100.2f);
		a1.add(22.2f);		
		a1.add(330.3f);
		a1.add(44.4f);
		
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




	
