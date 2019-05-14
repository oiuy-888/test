package test;

import java.util.Scanner;
import org.junit.Test;

public class Test9 {
	
	@Test
	public void demo52() {
		// 百家姓
        System.out.println("请输入百家姓：");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] m = new String[99999];
        int  n=0;
//        for(int i=0;i<str.length();i++){
//        	for(int j=i+2;j<i+5;j++){
//        		if((i<j)&&j+5<str.length()){
//        			m[n]=str.substring(i, j);
//            		n++;
//        		}
//        	}
//        }
        
        for(int i=0;i<str.length();i++){
        	if(i+2<str.length()&&n<99999){
        		for(int j=1;j<3;j++){
        			m[n]=str.substring(i, i+j).concat("");
                	n++;
        		}
        	}
        }
        for(int i=0;i<n;i++){
        	System.out.println(m[i]);
        }
        
	}
//

}
