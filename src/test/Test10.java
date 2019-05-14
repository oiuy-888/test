package test;
import java.util.Random;

import org.junit.Test;

public class Test10 {

	@Test
	public void demo53() {
		String[] str={"1","2","3","4","5","6","7","8","9","0"};
		String[] mobile = new String[11];
		mobile[0]="1";
		for(int i=0;i<str.length;i++){
			mobile[1]=str[i];
			for(int j=0;j<str.length;j++){
				mobile[2]=str[j];
				for(int m=0;m<str.length;m++){
					mobile[3]=str[m];
					for(int n=0;n<mobile.length;n++){
						if(mobile[n]==null){
							Random ran=new Random();
							int result=ran.nextInt(9);
							mobile[n]=Integer.toString(result);
						}
						System.out.print(mobile[n]);
					}
					System.out.println();
				}
			}
		}
}
}
