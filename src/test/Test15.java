package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.junit.Test;
import com.jayway.jsonpath.JsonPath;
import net.sf.json.JSONObject;

public class Test15 {

	@Test
	public void demo58(){
		
		System.out.println("请输入字符串");
		Scanner in = new Scanner(System.in);
		String result = in.nextLine();
		try {
			 List<String> read = JsonPath.read(result,"$.param[0].*");
			 for(String i:read){
				 System.out.println(i);
			 }
		} catch (Exception e) {
	    	e.printStackTrace();
		}
	}
/*
 *
 * {"param":[{"idCard":"15020219910520303X","name":"李帅1","mobile":"15092269471"},{"idCard":"15020219910520303X","name":"李帅2","mobile":"15092269471"},{"idCard":"15020219910520303X","name":"李帅3","mobile":"15092269471"},{"idCard":"15020219910520303X","name":"李帅4","mobile":"15092269471"},{"idCard":"15020219910520303X","name":"李帅5","mobile":"15092269471"}],"loginName":"","pwd":"","serviceName":"IdNamePhoneStatusCmccCheck"}
 * 
*/
}
