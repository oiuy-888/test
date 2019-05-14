package test;
import java.io.File;
import org.junit.Test;
import jxl.Cell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Test13 {
	
	@Test
	public void demo56(){
		try {
//			String[] m = {"fail","success","success"};
			//使用jxl方式读取，可能只能支持xls格式的文件，对于xlsx格式就不再支持，只修改扩展名的文件也不能适用
			Workbook wb = Workbook.getWorkbook(new File("D:/opt/行政区划代码0423.xls"));
			WritableWorkbook wwb = Workbook.createWorkbook(new File("D:/opt/行政区划代码0423.xls"),wb);
			WritableSheet wws = wwb.getSheet(0);
			Cell cell;
			String str;
			int n = wws.getRows();
			for(int i=0;i<n;i++){
				//先列后行
				cell = wws.getCell(0,i);
				str=cell.getContents()+"199104010118";
				Label label;
//				// Label(x,y,z) 代表单元格的第x列，第y行, 内容z
				label = new Label(2,i,str);
				wws.addCell(label);
			}
			wwb.write();
			wwb.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
}
