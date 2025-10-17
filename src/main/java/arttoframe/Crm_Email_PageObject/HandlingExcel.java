package arttoframe.Crm_Email_PageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class HandlingExcel {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        String filePath = "C:\\Users\\Mahesh\\Downloads\\Book1.xlsx"; 


        try (FileInputStream fis = new FileInputStream(filePath)) {
            Workbook wb = WorkbookFactory.create(fis);

            // Modify Excel file: Add "testing" to Row 1, Cell 1
            wb.getSheetAt(0).createRow(0).createCell(0).setCellValue("testing");

            // Write changes back to the file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                wb.write(fos);
            }

            wb.close();
            System.out.println("✅ Successfully updated: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
