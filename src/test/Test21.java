package test;
import java.util.Scanner;

import org.junit.Test;

public class Test21 {

	    @Test
	    public void demo62() {
	    	String s="12344321";
	        boolean result=true;
	        int leng=s.length();
	        if(leng%2 != 0)
	        {
	            result=false;
	        }else{
	            for(int i=0;i<leng/2;i++){
	                if((String.valueOf(s.charAt(i))).equals(String.valueOf(s.charAt(leng-i-1))))
	                {
	                	//Nothing
	                }else{
	                    result=false;
	                }
	            }
	        }
	        System.out.println(result);
	    }
}
