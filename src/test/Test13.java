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
			//ʹ��jxl��ʽ��ȡ������ֻ��֧��xls��ʽ���ļ�������xlsx��ʽ�Ͳ���֧�֣�ֻ�޸���չ�����ļ�Ҳ��������
			Workbook wb = Workbook.getWorkbook(new File("D:/opt/������������0423.xls"));
			WritableWorkbook wwb = Workbook.createWorkbook(new File("D:/opt/������������0423.xls"),wb);
			WritableSheet wws = wwb.getSheet(0);
			Cell cell;
			String str;
			int n = wws.getRows();
			for(int i=0;i<n;i++){
				//���к���
				cell = wws.getCell(0,i);
				str=cell.getContents()+"199104010118";
				Label label;
//				// Label(x,y,z) ����Ԫ��ĵ�x�У���y��, ����z
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
