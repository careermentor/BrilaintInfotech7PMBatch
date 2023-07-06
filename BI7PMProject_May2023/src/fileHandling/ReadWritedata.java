package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class ReadWritedata 
{

	public void readprop() throws Exception
	{
		//File f = new File("./TestData/config.properties");  //file connection
		FileReader fr = new FileReader("./TestData/config.properties");
		
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load the data which is prop file into temp memory
		System.out.println(prop.get("application_url"));
		System.out.println(prop.get("browser_name"));
	}
	
	
	public void writedata() throws Exception
	{
		
		File f = new File("./TestData/xyz.txt");  //file connection
		
		FileWriter fw = new FileWriter(f);
		fw.write("This is write program");
		fw.flush();
		fw.close();
		
	}
	
	public void readdata() throws Exception
	{
		
		//File f = new File("./TestData/abc.txt");  //file connection
		
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("./TestData/abc.txt");  //inbuild class
		
		int i =fr.read();  //116
		
		//for, while, do-while, if-else (loops/conditions)
		
		while(i!=-1)  //i = 116, 104
		{
			System.out.print((char)i); //116
			i=fr.read();    //read next character (ascii value) 
		}
	}
	
	public static void main(String[] args) throws Exception {
		ReadWritedata rwd = new ReadWritedata();
		//rwd.readdata();
		rwd.writedata();
		rwd.readprop();
				
	}
	
}
