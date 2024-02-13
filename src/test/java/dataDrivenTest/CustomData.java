package dataDrivenTest;

import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="Mydata")
	public Object[][] testData()
	{
		Object data[][]={{"Admin","admin123"},{"Poonam","test123"},{"Amit","test123"}};
		return data;
	}
}
