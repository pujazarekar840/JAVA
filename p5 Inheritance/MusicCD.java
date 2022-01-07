package p5;
public class MusicCD extends Item {
	private int volume;
	private String artist;
	
	public MusicCD() {
	    volume=5;
		artist="Nima";
	}
	public MusicCD(int pr,String tit,String p,int vol,String ar)
	{
		super(pr,tit,p); 
		volume=vol;
		artist=ar;
	}
	public String toString() {
	
		return volume+"  "+artist+" "+super.toString();
	}
	

}
