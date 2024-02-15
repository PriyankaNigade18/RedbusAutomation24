package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	XSSFWorkbook wb;
	@DataProvider(name="Mydata")
	public Object[][] testData()
	{
		Object data[][]={{"Admin","admin123"},{"Poonam","test123"},{"Amit","test123"}};
		return data;
	}
	
	
	@DataProvider(name="ExcelFile")
	public Object[][] fileData()
	{
		//path of the file
		  
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  FileInputStream fs;
		  Object data[][]=null;
		  try {
			fs=new FileInputStream(f1);
			//Wb-->sheet--->row-->cell-->data
			 wb =new XSSFWorkbook(fs);
			  //number of rows
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Number of rows: "+rows);
			  
			  //number of cell
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  
			  
			  //create an array
			  data=new Object[rows-1][cells];
			  
			  for(int r=1;r<rows;r++)
			  {
				  for(int c=0;c<cells;c++)
				  {
					  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					  System.out.print(data[r-1][c]+" ");
				  }
				  System.out.println();
			  }
			  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return data;
		  
		  
	}
	
}
