package test;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Test16 {
	
	@SuppressWarnings("resource")
	@Test
	public void Demo59(){
		
//		System.out.println("�������ַ���");
//		Scanner in = new Scanner(System.in);
//		String result = in.nextLine();
		/*
		 * \d ��ʾ0-9 ����һ������ ������+�� ˵�����0-9������λ����һ����� ����21312314
		 * \s ��ʾֻҪ���ֿհ׾�ƥ��
		 * ����m����ʾ���ն���ģʽÿ����ȡһ�н���ƥ��
		����\\��һ�㺬�� ת������ �����Ҳ�Ҫ��ʾ0-9 ����Ҫ��ʾ��ĸd �������Ϊ \\d =d ��\d=[0-9]
		*��ʾ�����е����ݳ���0�����
		^��������ʽƥ���ַ�����ʼλ�� 
		$�������������
		Matcher
		matches()�������ַ�������ƥ��,ֻ�������ַ�����ƥ���˲ŷ���true
		lookingAt()��ǰ����ַ�������ƥ��,ֻ��ƥ�䵽���ַ�������ǰ��ŷ���true
		find()���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��
		Matcher
		start()����ƥ�䵽�����ַ������ַ����е�����λ��. 
        end()����ƥ�䵽�����ַ��������һ���ַ����ַ����е�����λ��. 
        group()����ƥ�䵽�����ַ��� 
        https://www.cnblogs.com/ggjucheng/p/3423731.html
		*
		*/
//		Pattern p = Pattern.compile("([a-z]+)(\\d+)");
//		Matcher m = p.matcher("asf2223bb324dfdsg234");
//		System.out.println(m.groupCount());
//	    while (m.find()) {
//	    	System.out.println(m.group()+"----------------");
//	    }
		
//		String[] str = p.split(result);
//		for(int i=0;i<str.length;i++){
//			System.out.println(str[i]);
//		}
		String in = "a@@@b";
		String[] str = in.split("@");
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]+"��"+i+"��Ԫ��");
		}
	}
}
