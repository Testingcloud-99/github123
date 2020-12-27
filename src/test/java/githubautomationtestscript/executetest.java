package githubautomationtestscript;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import junit.framework.Assert;

public class executetest {

	
	//public static void main(String[] args) throws Exception{
    
	@Test
	public void leadtest() throws Exception{
		keywords key= new keywords();
		ArrayList a = new ArrayList();
		
		try
		
		{
	            FileInputStream file = new FileInputStream(new File("D://github.xlsx"));

	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);

	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheet("sheet1");

	            //Iterate through each rows one by one
	            Iterator<Row> itr= sheet.iterator();
	            while (itr.hasNext()) 
	            {
	                Row row = (Row)itr.next();
	                //For each row, iterate through all the columns
	                Iterator<Cell> cellitr = row.cellIterator();

	                while (cellitr.hasNext()) {
	                    Cell celldata = (Cell)cellitr.next();
	                    //Check the cell type and format accordingly
	                    switch (celldata.getCellType()) 
	                    {
	                    case STRING:
	                    	a.add(celldata.getStringCellValue());
	                    	break;
	                    case NUMERIC:
	                    	a.add(celldata.getNumericCellValue());
	                    	break;
	                    case BOOLEAN:
	                    	a.add(celldata.getBooleanCellValue());
	                    	break;
	                   
	                    default:
	                    	break;
	                    }
	                   
	                }
	                
	            }
		}
	    
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	   
	for(int i=0;i<a.size();i++) {
		
		if(a.get(i).equals("openbrowser")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.openbrowser();
			}
		}
		if(a.get(i).equals("navigate")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.navigate(data);
			}
		}	
	
//		if(a.get(i).equals("verifytitle")) {
//			String keyword=(String)a.get(i);
//			String data=(String)a.get(i+1);
//			String objectname=(String)a.get(i+2);
//			String runmode=(String)a.get(i+3);
//			if(runmode.equals("yes")) {
//				String actualvalue=key.verifytitle();
//				Assert.assertEquals(data, actualvalue);
//				key.navigate(data);
//			}
//		}	
//		
		if(a.get(i).equals("input")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.input(data,objectname);
			}
		}	
		if(a.get(i).equals("click")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.click(objectname);
			}
		}	
		if(a.get(i).equals("clickcs")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.click(objectname);
			}
		}	
	
		if(a.get(i).equals("terminate")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.terminate();
			}
		}	
		if(a.get(i).equals("radio")) {
			String keyword=(String)a.get(i);
			String data=(String)a.get(i+1);
			String objectname=(String)a.get(i+2);
			String runmode=(String)a.get(i+3);
			if(runmode.equals("yes")) {
				key.click(objectname);
			}
		}	
	
	
	
	}
	
	
	
	
	
	
	
	}	
		
	}
