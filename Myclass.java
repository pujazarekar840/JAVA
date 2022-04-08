public class Myclass {
	public void multiply(int a,int b)
	{
		System.out.println("you are in int");	
	}
	public void multiply(float a,float b)
	{
		System.out.println("you are in float");
	}
	public void multiply(double a,double b)
	{
		System.out.println("you are in double");	
	}
	public static void main(String[]args) {
		Myclass m=new Myclass();
		m.multiply(1,2);
	}

}
