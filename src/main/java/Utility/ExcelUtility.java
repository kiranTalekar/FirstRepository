package Utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtility {

	public FileInputStream fis;
	public HSSFWorkbook workbook;
	public String filepath;
	public HSSFSheet sheet;
	public HSSFRow row;
	
	
	public ExcelUtility(String excelfile) throws Exception {
		fis=new FileInputStream(excelfile);
		workbook=new HSSFWorkbook(fis);
		
	}

	public int getRowCount(String sheetname){
		sheet = workbook.getSheet(sheetname);
		int rowCount=sheet.getLastRowNum()+1;
		return rowCount;
	}
	
	public int getcolumnCount(String sheetname){
		sheet=workbook.getSheet(sheetname);
		row = sheet.getRow(0);
		int colCount=row.getLastCellNum();
		return colCount ;
	}
	
	public  HSSFRow getRowData(String sheetname,int rowNum) throws Exception{
			
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rowNum);
			//row.toString();
		System.out.println(row);
			return row;
	}
	
	public void getAllExcelData(String sheetname){
		sheet=workbook.getSheet(sheetname);
		int rows=sheet.getLastRowNum()+1;
		int cols=row.getLastCellNum();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				HSSFCell cell = sheet.getRow(i).getCell(j);
				System.out.print(cell);
			}
			System.out.println("/t ");
		}
		
	}
	
	
}
