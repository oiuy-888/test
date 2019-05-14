package test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.junit.Test;

public class Test5 {

	@Test
	public void demo40() {
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("×Ö·û´®³¤¶ÈÎª£º"+str.length());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.parseInt(str));
		list.add(1235);
		list.add(456);
		Collections.sort(list);
		System.out.println("ÅÅĞòºó×Ö·û´®£º");
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
