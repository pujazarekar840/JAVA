package p5;
public class Software extends Item {
	private int version;
	public Software() {
	    version=9;
	}
	public Software(int pr,String tit,String p,int ver)
	{
		super(pr,tit,p); 
		version=ver;
	}
	public String toString() {
	
		return version+" "+super.toString();
		
	}
	

}
