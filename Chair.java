public class Chair {
	private int price;
	private String name,color;
	public Chair()
	{
		price=101;
		name="officechair";
		color="pink";
	}
	public Chair(int pr,String nm,String c)
	{
		price=pr;
		name=nm;
		color=c;
	}
	public void display()
	{
		System.out.println(price+" "+name+" "+color);
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int pr)
	{
		price=pr;
	}
	public static void main(String[]args)
	{
		Chair c=new Chair();
		c.display();
		
		Chair c2=new Chair(200,"folding","blue");
		c2.display();
		
		System.out.println(c2.getprice());
		c2.setprice(200);
		c2.display();
	}
}
