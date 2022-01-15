public class MobileDevice {
	private int id,price;
	private String name,color;
	public MobileDevice()
	{
		id=101;
		price=3000;
		name="oppo";
		color="blue";
	}
	public MobileDevice(int i,int pr,String nm,String c)
	{
		id=i;
		price=pr;
		name=nm;
		color=c;
	}
	public void display()
	{
		System.out.println(id+" "+price+" "+name+" "+color);
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
		MobileDevice m=new MobileDevice();
		m.display();
		
		MobileDevice m2=new MobileDevice(2,200,"Asus","pink");
		m2.display();
		
		System.out.println(m2.getprice());
		m2.setprice(200);
		m2.display();
	}
	

}
