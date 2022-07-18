package Reusability;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import Admin.*;


public class Read_Excel_Data {

	static int sheets;
	static int rows;
	static int column;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static String value;
	static int line=2;
	static List<String> username=new ArrayList<String>();
	static List<String> password=new ArrayList<String>();
	
	public static void ReadData(String exceldata) throws IOException, InterruptedException {
		DataFormatter formatter = new DataFormatter();
		FileInputStream excel= new FileInputStream(exceldata);
        XSSFWorkbook book = new XSSFWorkbook(excel);
        sheets=book.getNumberOfSheets();
        for(int i=0;i<sheets;i++) {
        	sheet=book.getSheetAt(i);
        	rows=sheet.getLastRowNum();
        	for(int j=1;j<=rows;j++) {
        		row=sheet.getRow(j);
        		column=row.getLastCellNum();
        		for(int k=0;k<column;k++) {
        			cell=row.getCell(k);
        			if(line%2==0) {
        				username.add(formatter.formatCellValue(cell));
        				System.out.println("username: "+cell);
        			}else {
        				password.add(formatter.formatCellValue(cell));
        				System.out.println("password: "+cell);
        			}
        			line++;
        		}
        	}
        }
        for(int i=0;i<username.size();i++) {
        	Login.Credentials(username.get(i), password.get(i));
        	
        
  			
  		}
	}


}
