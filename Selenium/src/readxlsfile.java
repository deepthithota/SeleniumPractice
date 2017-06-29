import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readxlsfile {

@Test
public void test() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	InputStream inp = new FileInputStream("E:\\test.xls");
	new WorkbookFactory();
	Workbook wp = WorkbookFactory.create(inp);
	Sheet s=wp.getSheetAt(0);
	System.out.println(s.getRow(1).getCell(1));
	
	
}
}
