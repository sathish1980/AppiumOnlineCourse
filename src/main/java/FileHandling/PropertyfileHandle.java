package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileHandle {
	
	String filepath = System.getProperty("user.dir") +"\\Environment\\env.properties";
	
	public void propertyRead() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		Properties P = new Properties();
		P.load(FI);
		System.out.println(P.getProperty("username"));
		System.out.println(P.getProperty("browser"));
		System.out.println(P.getProperty("url"));
		System.out.println(P.getProperty("password"));
		P.setProperty("password","test");
		System.out.println(P.getProperty("password"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyfileHandle P = new PropertyfileHandle();
		P.propertyRead();
	}

}
