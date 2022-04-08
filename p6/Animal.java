package p6;
public abstract class Animal {
	String Atype;
	public Animal() {
		Atype="wild";
	}
	public Animal(String At) {
		Atype=At;
	}
	public String toString()
	{
		return Atype+" ";
	}
	public abstract void eat();
	public abstract void type ();


}
