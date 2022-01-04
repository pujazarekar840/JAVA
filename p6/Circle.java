package p6;
public class Circle extends shape {
	double radius;
	public Circle() {
		radius=2;
	}
	public Circle(double r,String col)
	{
		super(col);
		radius=2;
	}
	public String toString() {
		return radius+" "+super.toString();
	}
	public void draw() {
		System.out.println("draw circle");
	}
	public void area() {
		System.out.println("area of circle"+3.14*radius*radius);
	}

}
