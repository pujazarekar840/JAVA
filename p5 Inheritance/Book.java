package p5;
public class Book extends Item {
	private int edition;
	private String author;
	
	public Book() {
	    edition=5;
		author="Nehru";
	}
	public Book(int pr,String tit,String p,int ed,String au)
	{
		super(pr,tit,p); 
		edition=ed;
		author=au;
	}
	public String toString() {
	
		return edition+"  "+author+" "+super.toString();
	}
	public void Start()
	{
		System.out.println("Book Perches");
	}

	

}
