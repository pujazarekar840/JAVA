package p14;
//Vector
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Test3 {
//GenericList Float Type
	public static void main(String[] args) {
		Vector<Float> a1=new Vector<>();
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
        System.out.println("*******************");
        //Stack-push,pop,peek,get,set functions
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.set(0, 90);
        System.out.println(s1);
        System.out.println(s1.get(2));
        
        
        
        
        
	}
}




	
