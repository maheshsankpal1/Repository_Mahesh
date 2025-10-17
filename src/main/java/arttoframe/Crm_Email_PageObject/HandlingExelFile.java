package arttoframe.Crm_Email_PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class HandlingExelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Ensure this is an Excel file (.xlsx or .xls), not CSV
		String filePath = "C:\\Users\\Mahesh\\Downloads\\Test.xls";

		try (FileInputStream fis = new FileInputStream("file;path")) {
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheetAt(0).getRow(1).getCell(2);
			System.out.println(wb);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
