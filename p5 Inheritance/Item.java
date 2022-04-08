package p5;
public class Item {
	private int price;
	private String title,publisher;
	public Item() {
		price=100;
		title="DsIndia";
		publisher="Jawahrlalji";
	}
	public Item(int pr,String tit,String p) {
	    price=pr;
		title=tit;
		publisher=p;
	}
	public String toString() {
		return price+" "+title+" "+publisher;
	}
	public void Start()
	{
		System.out.println("Item Perches");
	}
}



