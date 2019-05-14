package test;

import java.util.Scanner;
import org.junit.Test;

public class Test8 {
	
	@Test
	public void demo51() {
		System.out.println("请输入");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		String reg;// 最大字符串
		String left;// 剩余字符串
		int k = 0;// 计数器
		int len = 0;// 最大字符串的长度
		String result = null;// 最终结果
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length()-i;j++){
				if(k<j+1){
					reg=str.substring(k, j+1);
					left=str.substring(j+1);
					if(left.indexOf(reg)!=-1 && reg.length()!=1){
						if(len<reg.length()){
							result=reg;
							len=result.length();
						}
						
					}	
				}
			}
			k++;
		}
		System.out.println("最大长度: "+len+" 对应字符串： "+result);
		
	}
	
}
