package p6;
public abstract class shape {
	String scolor;
	public shape() {
		scolor="pink";
	}
	public shape(String sc) {
		scolor=sc;
	}
	public String toString()
	{
		return scolor+" ";
	}
	public abstract void draw();
	public abstract void area();

}
