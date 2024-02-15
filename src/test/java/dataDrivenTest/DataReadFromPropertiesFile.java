package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataReadFromPropertiesFile {
  @Test
  public void readFile() throws IOException 
  {
	  File f1=new File(System.getProperty("user.dir")+"//Config.properties");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties class
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  
	  System.out.println("Browser name: "+p1.getProperty("bname"));
	  
  }
}
