package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelExample {
	public static void main(String[] args) throws IOException {


		File f = new File(
				"C:\\Users\\Theepan\\MavExample\\excelworksheet\\excel data.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook workbook=new XSSFWorkbook(s);
		Sheet sheet = workbook.getSheet("datas");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell =row.getCell(j);
				CellType type=cell.getCellType();			
			switch (type) {
			case STRING:
				String string = cell.getStringCellValue();
				System.out.println(string);
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {

					Date date = cell.getDateCellValue();
				SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
				String string2 = format.format(date);
				System.out.println(string2);
					}
				else {
				double cellValue = cell.getNumericCellValue();
				BigDecimal num = BigDecimal.valueOf(cellValue);
				String numbers = num.toString();
				System.out.println(numbers);
				break;
				}

			default:
				break;
			}
				

			}}

	}}
