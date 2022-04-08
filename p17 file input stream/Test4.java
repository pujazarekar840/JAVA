package p17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class Animal
{
	
}
public class Test4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream ("info.properties");
		Properties p=new Properties();
		p.load(fi);
		String s1=p.getProperty("user");
		System.out.println(s1);
		String s2=p.getProperty("password");
		System.out.println(s2);
		String s3=p.getProperty("myfavcolor");
		System.out.println(s3);
		

	}

}
