package p3;

public class Demo2 {
	//var argument
	public static void add(int ... a)
	{
		for(int x:a)
		{
			System.out.println(x);
		}
	System.out.println("****************");
	}
	 
	public static void main(String[] args) {
		
		add(1,2);
		add(1,2,4);
		add(1,2,4,44);
		add(1,2,4,33,6,7,9,10);
		
		int m[]={3,4,2,6,7,8};
		add(m);
	}

}
