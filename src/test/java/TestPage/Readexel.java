package TestPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;


public class Readexel {
	@Test
	public void verifyread() throws Exception{
		File loc=new File("E:\\NewData.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook wb=new HSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		for(int i=0; i< sh.getPhysicalNumberOfRows(); i++) {
			Row row=sh.getRow(i);
			for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}
}
			/*int row1=5;
			int col=2;
			Row rows=sh.getRow(row1);
			if(rows==null) {
				sh.createRow(row1);
			}
			Cell currentcell=sh.getRow(row1).getCell(col);
			if(currentcell==null) {
				sh.getRow(row1).createCell(col).setCellValue("test message");
				
			}
			else {
				sh.getRow(row1).getCell(col).setCellValue("test message");
			}
			FileOutputStream out=new FileOutputStream("");
			wb.write(out);
			out.close();
			}
			
		}*/
		

				
				
			


