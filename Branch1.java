class Customer {
	private int cid;
	private String name,address;
	private int cno;
	public Customer() {
		cid=1011;
		name="Rohan";
		address="Pune karve road";
		cno=911234;
	}
	public Customer(int i,String nm,String add,int n)
	{
		cid=i;
		name=nm;
		address=add;
		cno=n;
	}
	public int getCno()//accessor method-access value of instance field
	{
		return cno;
	}
	public void setCno(int cn)//mutator method-modify value of instance field
	{
		cno=cn;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String ad)
	{
		address=ad;
	}
	public void display()
	{
		System.out.println(cid+" "+name+" "+address+" "+cno);
	}
}
	public class Branch1{
		public static void main(String[]args) {
			Customer c1=new Customer(1022,"Yash","Pune ABC Road",90222);
			c1.display();
			//System.out.println(c1.getAddress());
			c1.setAddress("Pune MJ Road");
			c1.display();
			Customer c2=new Customer(1023,"Ram","Pune XYZ Road",93333);
			c2.display();
			c2.setCno(9223456);
			System.out.println("Updated cno= "+c2.getCno());
		}
}
	


