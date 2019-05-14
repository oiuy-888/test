package test;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Test16 {
	
	@SuppressWarnings("resource")
	@Test
	public void Demo59(){
		
//		System.out.println("请输入字符串");
//		Scanner in = new Scanner(System.in);
//		String result = in.nextLine();
		/*
		 * \d 表示0-9 任意一个数字 后面有+号 说明这个0-9单个数位出现一到多次 比如21312314
		 * \s 表示只要出现空白就匹配
		 * （？m）表示按照多行模式每次提取一行进行匹配
		两个\\的一般含义 转义作用 比如我不要表示0-9 而是要表示字母d 可以理解为 \\d =d ；\d=[0-9]
		*表示（）中的内容出现0到多次
		^是正则表达式匹配字符串开始位置 
		$是正则结束符号
		Matcher
		matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true
		lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
		find()对字符串进行匹配,匹配到的字符串可以在任何位置
		Matcher
		start()返回匹配到的子字符串在字符串中的索引位置. 
        end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置. 
        group()返回匹配到的子字符串 
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
			System.out.println(str[i]+"第"+i+"个元素");
		}
	}
}
