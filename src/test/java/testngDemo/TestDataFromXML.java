package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataFromXML 
{
@Parameters({"un","psw"})
  @Test
  public void loginData(String un,String psw) 
  {
	  System.out.println("User name: "+un);
	  System.out.println("password: "+psw);

  }
}
