package test;
import jxl.write.Label;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

import jxl.Cell;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Test14 {
	
	@Test
	public void demo57() throws Exception{
		int n;
		String cid = null;
		Workbook wb = Workbook.getWorkbook(new File("D:/opt/行政区划代码0423.xls"));
		WritableWorkbook wwb = Workbook.createWorkbook(new File("D:/opt/行政区划代码0423.xls"), wb);
		WritableSheet wws = wwb.getSheet(0);
		Cell cell;
		int row = wws.getRows();
		String[] reg = new String[row];
		for(int i=0;i<row;i++){
			cell = wws.getCell(0,i);
			reg[i]=cell.getContents();
		}
		
		for(int i=0;i<row;i++){
			URL url = new URL("http://sfz.uzuzuz.com/?region="+reg[i]+"&birthday=19910401&sex=1&num=1");
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setDoInput(true);
			http.setDoOutput(true);
			http.setUseCaches(false);
			http.setConnectTimeout(30000);
			http.setReadTimeout(30000);
			http.setRequestMethod("GET");
			http.connect();
			String result = null;
			String input;
			if(http.getResponseCode()==200){
				BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream(), "utf-8"));
				while((input=in.readLine())!=null){
					result+=input;
				}
				in.close();
			}
		    String result1 = result.trim();
		    System.out.println(result1);
			if((n=result1.lastIndexOf("vertical-align: middle"))!=-1){
				cid=result1.substring(n+25, n+43);
			}else{
				cid="无结果";
			}
			Label label;
			label = new Label(3,i,cid);
			wws.addCell(label);
			System.out.println(i);
		}
		wwb.write();
		wwb.close();
	}
}
