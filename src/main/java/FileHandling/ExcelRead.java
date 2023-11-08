package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelRead {

	String filepath = System.getProperty("user.dir")+"\\Input\\sample123.xls";
	public void GetDataFromExcel() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		//XSSFWorkbook excel = new XSSFWorkbook(FI);
		HSSFWorkbook excel = new HSSFWorkbook(FI);

		Sheet eachSheet = excel.getSheet("Login");
		int totalrows =eachSheet.getPhysicalNumberOfRows();
		for(int i =0;i<totalrows;i++)
		{
			Row eachRow = eachSheet.getRow(i);
			int totalColumn=eachRow.getLastCellNum();
			for(int j =0;j<totalColumn;j++)
			{
				Cell eachCell = eachRow.getCell(j);
				System.out.print(readdataassuch(eachCell));
			}
			System.out.println("");

		}
	}

	public static Object readdataassuch(Cell cellvalue)
	{
		Object s = null;
		if(cellvalue.getCellType().equals(CellType.STRING))
		{
			s= cellvalue.getStringCellValue();
		}
		else if(cellvalue.getCellType().equals(CellType.NUMERIC))
		{
			DataFormatter dataFormatter = new DataFormatter();
			s = dataFormatter.formatCellValue(cellvalue);
		}

		return s;
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead E = new ExcelRead();
		E.GetDataFromExcel();
	}

}
