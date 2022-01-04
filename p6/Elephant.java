package p6;
public class Elephant extends Animal {
	String Acolor ;
	public Elephant() {
		Acolor="Gray";
	}
	public Elephant(String Aco,String ty)
	{
		super(ty);
		Acolor="Gray";
	}
	public String toString() {
		return Acolor+" "+super.toString();
	}
	public void eat() {
		System.out.println("Indian animal");
	}
	public void type() {
		System.out.println(" Elephant eats");
	}


}
