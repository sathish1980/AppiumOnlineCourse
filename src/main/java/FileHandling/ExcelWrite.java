package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelWrite {
	String filepath = System.getProperty("user.dir")+"\\Input\\output.xls";
	String[] fruits= {"apple","orange","mango"};

	public void WriteData() throws IOException
	{
		File F = new File(filepath);
		FileOutputStream FI = new FileOutputStream(F);
		HSSFWorkbook outfile = new HSSFWorkbook();
		Sheet outsheet = outfile.createSheet("outputFruits");
		int totalRows = fruits.length;
		for(int i=0;i<totalRows;i++)
		{
			Row creatRow =outsheet.createRow(i);

			Cell eachCell =creatRow.createCell(i);
			eachCell.setCellValue(fruits[i]);
		}
		outfile.write(FI);
		FI.close();
		System.out.println("Done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.WriteData();
	}

}
