package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

import net.sf.json.JSONObject;

public class Test11 {
	
	@Test
	public void demo54(){
		try {
			URL url = new URL("http://192.168.100.35:7280/data-service/airtravel/trareport/enc/01?account=apilishuai&name=70D51280A82DE0CF076ACD6A5692B741&cidType=6&sign=0E54C055597BDE480B15CCDB945A2C8A&reqTid=1234&cid=01BF2616C0E12739EE826266CFFC994E&month=3");
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
					result=input;
				}
				in.close();
			}
			
            //json简单转化提取
			JSONObject json = JSONObject.fromObject(result);
			System.out.println(json);
			String recode = json.optString("resCode");
			if(recode.equals("0000")){
				System.out.println(json.get("data").getClass());
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
	}

}
