package p3;

public class Demo1 {
	public static void main(String[]args){
		//Arrays in java are objects-stored in heap memory
		int [] a =new int [4];
		int [] b =new int [] {10,20,30,40};
		int [] c = {10,20,31,42};//first class object
		//enhanced for loop/for each loop
		for(int x:c)
		{
			System.out.println(x);
		}
		int s=0;
		for(int y:c)
		{
			s+=y;
		}
		float avg1=(float)s/c.length;
		System.out.println("average= "+avg1);
		
		/*for(int i=0;i<c.length;i++)
		  {
		    System.out.println(c[i]);
		  }
		  int sum=0;
		  for(int i=0;i<c.length;i++)
		  {
		     sum+=c[i];
		  }
		  float avg=(float)sum/c.length;
		  System.out.println("average= "+avg);*/
		  
	}
	
}
