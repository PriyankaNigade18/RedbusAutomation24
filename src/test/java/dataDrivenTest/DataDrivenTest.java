package dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest
{
//	@DataProvider(name="Mydata")
//	public Object[][] testData()
//	{
//		Object data[][]={{"Admin","admin123"},{"Poonam","test123"},{"Amit","test123"}};
//		return data;
//	}
	
	
	
	
  @Test(dataProvider ="Mydata",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw)
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
	  
  }
}
