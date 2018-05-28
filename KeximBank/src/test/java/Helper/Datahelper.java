package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Datahelper {
	
	
	// Map<String, String> storevalues=new HashMap<String, String>();
	public static  List<Map<String, String>>  data(String filename,String sheetname) 
	{
		List<Map<String, String>> currenthash=new ArrayList<Map<String,String>>();
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			Workbook wb=new HSSFWorkbook(fis);
			
			Sheet sh=wb.getSheet(sheetname);
			
			Row headerrow=sh.getRow(0);
			
			for(int i=1;i<sh.getPhysicalNumberOfRows();i++)
			{
				Row currentrow=sh.getRow(i);
				
				HashMap<String, String> hashmap=new HashMap<String, String>();
				
				for(int j=0;j<currentrow.getPhysicalNumberOfCells();j++)
				{
					Cell currentcell=currentrow.getCell(j);
					
					switch (currentcell.getCellType()) 
					{
					
					
					case Cell.CELL_TYPE_STRING:
						
						hashmap.put(headerrow.getCell(j).getStringCellValue(), currentcell.getStringCellValue());
						
						break;
					}
					
				}
				
				currenthash.add(hashmap);
				fis.close();
			
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		return currenthash;
	}
	

}
