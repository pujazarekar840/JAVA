package p6;
public class LivingBeing {
	public static void main(String[] args) {
		// cannot instantiate the type shape
		//Shape s=new Shape();//cannot create object of abstract class
		
		Tiger t=new Tiger();
		System.out.println(t);
		t.eat();
		t.type();
		
		Elephant e=new Elephant();
		System.out.println(e);
		e.eat();
		e.type();
		
		Animal a=new Tiger();
		a.eat();
		
		Animal an=new Elephant();
		an.eat();
		

	}


}
