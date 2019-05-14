package test;

import java.util.Scanner;

import org.junit.Test;

public class Test4 {
	
	@Test
	public void demo39() {
		double sum=0;
		Scanner in = new Scanner(System.in);
        System.out.println("ÊäÈënµÄÖµ£º");
        int n = in.nextInt();
        if(n%2==0){
        	for(int i=2;i<=n;i=i+2){
        		sum=sum+(1/(double)i);
        	}
        	System.out.println();
        }else{
            for(int i=1;i<=n;i=i+2){
            	sum=sum+(1/(double)i);
        	}
        }
        System.out.println(sum);
	}

}
