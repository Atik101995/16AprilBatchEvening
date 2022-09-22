package automationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelSheetProgram 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//file locate address
		String Address = "D:\\velocity\\16april.xlsx";
		
		FileInputStream file = new FileInputStream(Address);
		
		//workbook read
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		
	}

} 
