package p3;

public class Demo3 {
	//var argument
	public static void add(String name,int ... a)
	{
		System.out.println(name);
		for(int x:a)
		{
			System.out.println(x);
		} 
		System.out.println("****************");
	}
	 
	public static void main(String[] args) {
		
		add("Varun", 90,88);
		add("Nitin",55,66,77);
		add("Soha",64,73,44,22,99);
		 
		}


}
