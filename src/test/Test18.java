package test;
import org.junit.Test;

public class Test18  {
	
	//@Test 此Junit方法与多线程不兼容
	public void Demo61(){
		Test17 station1 = new Test17("窗口1");
		Test17 station2 = new Test17("窗口2");
		Test17 station3 = new Test17("窗口3");
		station1.start();
		station2.start();
		station3.start();
	}
	
	public static void main(String[] args) {
		Test17 station1 = new Test17("窗口1");
		Test17 station2 = new Test17("窗口2");
		Test17 station3 = new Test17("窗口3");

		station1.start();
		station2.start();
		station3.start();
	}
}
