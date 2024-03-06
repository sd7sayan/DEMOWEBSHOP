package GenericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility extends WebdriverUtility{
	public static String fetchData(String sheetname, int row, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.excelpath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		return s.getRow(row).getCell(cell).toString();
		
	}

	public static int rowSize(String sheetname) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.excelpath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		return s.getPhysicalNumberOfRows();	
	}
	
	public static int cellSize(String sheetname) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.excelpath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	
	public static Object[][] fetchAllData(String sheetname) throws Throwable{
		
		FileInputStream fis =  new FileInputStream(IpathConstant.excelpath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		
		int rowsize = s.getPhysicalNumberOfRows();
		int cellsize = s.getRow(0).getPhysicalNumberOfCells();
		Object d[][]= new Object[rowsize][cellsize];
		for(int i=0;i<rowsize;i++) {
			for (int j=0;i<cellsize;j++) {
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}
}


