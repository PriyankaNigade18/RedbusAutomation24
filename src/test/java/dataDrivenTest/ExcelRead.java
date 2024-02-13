package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
  @Test
  public void read() throws IOException
  {
	  //path of the file
	  
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Wb-->sheet--->row-->cell-->data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows: "+rows);
	  
	  //number of cell
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  
	  
	  //create an array
	  Object data[][]=new Object[rows-1][cells];
	  
	  for(int r=1;r<rows;r++)
	  {
		  for(int c=0;c<cells;c++)
		  {
			  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			  System.out.print(data[r-1][c]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  //single data read
//	  String data=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
//	  System.out.println(data);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
