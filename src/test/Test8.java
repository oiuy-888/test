package test;

import java.util.Scanner;
import org.junit.Test;

public class Test8 {
	
	@Test
	public void demo51() {
		System.out.println("������");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		String reg;// ����ַ���
		String left;// ʣ���ַ���
		int k = 0;// ������
		int len = 0;// ����ַ����ĳ���
		String result = null;// ���ս��
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
		System.out.println("��󳤶�: "+len+" ��Ӧ�ַ����� "+result);
		
	}
	
}
