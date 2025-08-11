package Demo;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.gson.JsonObject;

public class Excelreader {

	public static  JsonObject readdata() throws Exception {
		JsonObject jo = new JsonObject();
		String filepath ="C:\\Users\\lenovo\\OneDrive\\Documents\\Restassured.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("post");
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 1; i <= rowcount; i++) {
			String key = sheet.getRow(i).getCell(0).getStringCellValue();
			try {
				String value = sheet.getRow(i).getCell(1).getStringCellValue();
				jo.addProperty(key, value);
			} catch (Exception E) {
				double value = sheet.getRow(i).getCell(1).getNumericCellValue();
				jo.addProperty(key, value);
			}

			
		}
		return jo;
	}

}
