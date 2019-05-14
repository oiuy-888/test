package test;

import java.util.Scanner;

import org.junit.Test;

public class Demo19 {
	
	@Test
	public void demo63(){
		System.out.println("«Î ‰»Î");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str1 = str.trim();
        int a = str.lastIndexOf("110103199104018290");
        System.out.println(a);
	}
}
