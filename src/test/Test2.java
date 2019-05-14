package test;
import org.junit.Test;

public class Test2 {
		
		@Test
	    public void demo19() {
	        int i = 0;
	        int j = 0;
	        for (i = 1; i <= 4; i++) {
	            for (int k = 1; k <= 4 - i; k++)
	                System.out.print( " " );
	            for (j = 1; j <= 2 * i - 1; j++)
	                System.out.print("*");
	            System.out.println();
	        }
	        for (i = 3; i >= 1; i--) {
	            for (int k = 1; k <= 4 - i; k++)
	                System.out.print( " " );
	            for (j = 1; j <= 2 * i - 1; j++)
	                System.out.print("*");
	            System.out.println();
	        }
	    }
}
