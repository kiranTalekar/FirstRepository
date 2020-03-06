package Utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import PageObject.PageObject;

public class ExcelRowAndColCount extends PageObject {
	public FileInputStream fis;
	public HSSFWorkbook workbook;
	public String filepath;
	
	public static void main(String[] args) throws Exception {
		String excelfilepath="F:/jbk/input1.xls";
		String sheetname="Sheet1";
		ExcelUtility util=new ExcelUtility(excelfilepath);
		int rowCount=util.getRowCount(sheetname);
		System.out.println("Total row count:"+rowCount);
		int colCount=util.getcolumnCount(sheetname);
		System.out.println("Total coulumn count:"+colCount);
		util.getRowData(sheetname, 2);
		util.getAllExcelData(sheetname);
	}

	
	}

	


