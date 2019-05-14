package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;

public class Test3 {

	@Test
	public void demo36() {
		// TODO Auto-generated method stub

		System.out.println("输入数字个数n：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("输入后移位数m：");
		int m = in.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			System.out.print("请输入第"+(i+1)+"个数： ");
			list.add(in.nextInt());
		}
		System.out.println("原数组排序：");
		for (Integer a : list) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		List<Integer> temp1 = list.subList(list.size()-m, list.size());
		List<Integer> temp2 = list.subList(0, list.size()-m);
		temp2.addAll(0, temp1);
		System.out.println("移动后排序为:");
		for (Integer a : temp2) {
			System.out.print(a+" ");
		}
	}
}
