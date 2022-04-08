package p9;
class Product
{
	int pid;
	String name;
	public Product() {
	
	}
	public Product(int i,String nm){
		pid=i;
		name=nm;
	}
	public void print()
	{
		System.out.println("pid = "+pid+" name = "+name);
	}
}

public class Demo5 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try
		{
			Product p=null;
			p.print();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Ended ......");
		}
}
