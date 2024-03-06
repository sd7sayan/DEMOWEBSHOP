package GenericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {

	public static void main(String[] args) throws Throwable {
		System.out.println(Practice.fetchAllData("Sheet2"));
		
	}
public static Object[][] fetchAllData(String sheetname) throws Throwable{
		
		FileInputStream fis =  new FileInputStream(IpathConstant.excelpath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		
		int rowsize = s.getLastRowNum();
		int cellsize = s.getRow(0).getLastCellNum();
		Object d[][]= new Object[rowsize][cellsize];
		DataFormatter df= new DataFormatter();
		for(int i=0;i<rowsize;i++) {
			for (int j=0;i<cellsize;j++) {
				d[i][j]=df.formatCellValue(s.getRow(i).getCell(j));
			}
		}
		return d;
	}
}
