package test;
import java.util.Scanner;

import org.junit.Test;

public class Test6 {

	@Test
	public void demo41(){
		int sum=0;
		for(int i=6;;i++)//一颗一颗加桃子
		{
			sum=i;
			for(int j =0;j<5;j++){
				if((sum-1)%5==0){
					sum=(sum-1)/5*4;
					if(j==4){
						System.out.println(i);
						System.exit(0);
					}
				}
			}
		}
		
		
	}
}
