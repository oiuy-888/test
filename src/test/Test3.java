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

		System.out.println("�������ָ���n��");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("�������λ��m��");
		int m = in.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			System.out.print("�������"+(i+1)+"������ ");
			list.add(in.nextInt());
		}
		System.out.println("ԭ��������");
		for (Integer a : list) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		List<Integer> temp1 = list.subList(list.size()-m, list.size());
		List<Integer> temp2 = list.subList(0, list.size()-m);
		temp2.addAll(0, temp1);
		System.out.println("�ƶ�������Ϊ:");
		for (Integer a : temp2) {
			System.out.print(a+" ");
		}
	}
}
