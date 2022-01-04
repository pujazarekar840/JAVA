package p6;

public class Test1 {

	public static void main(String[] args) {
		// cannot instantiate the type shape
		//Shape s=new Shape();//cannot create object of abstract class
		
		Circle c=new Circle();
		System.out.println(c);
		c.draw();
		c.area();
		
		shape sp=new Circle();
		sp.draw();
		

	}

}
