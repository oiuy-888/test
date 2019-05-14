package test;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class Test12 {
	
	@Test
	public void demo55() throws WriteException {
		File file = new File("D:/opt/hello.xls");
		Workbook book;
		Sheet sheet;
		Cell cell;
		HashMap<Integer, String> hang = new HashMap<Integer,String>(); 
		try {
			book=Workbook.getWorkbook(file);
			sheet = book.getSheet(0);
			for(int i=1;i<4;i++){
				for(int j=0;j<=1;j++){
					cell = sheet.getCell(j,i);//ÁÐ¡¢ÐÐ
					hang.put(j, cell.getContents());	
				}
				Iterator<Entry<Integer, String>> entries= hang.entrySet().iterator();
				while(entries.hasNext()){
					Map.Entry<Integer, String> entry = entries.next();
					System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				}
			}	
			book.close();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
