package p6;
public class Tiger extends Animal {
	String Acolor ;
	public Tiger() {
		Acolor="orange";
	}
	public Tiger(String Aco,String ty)
	{
		super(ty);
		Acolor="orange";
	}
	public String toString() {
		return Acolor+" "+super.toString();
	}
	public void eat() {
		System.out.println("National animal");
	}
	public void type() {
		System.out.println(" tiger eats");
	}

	

	

}
