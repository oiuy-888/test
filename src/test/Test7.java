package test;

import org.junit.Test;

public class Test7 {
	//奇数个数
	//4
	//7*4
	//7*8*4
	//7*8*8*4
	//7*8*8*8*4
	//...
	@Test
	public void demo43() {
		int sum=0;
		for(int i=1;i<9;i++){
			if(i==1){sum=4;};
			if(i==2){sum=sum*7;};
			if(i>=3){sum=sum*8;};
			System.out.println("组成"+i+"位数是  "+sum+" 个");
		}
		
	}

}
