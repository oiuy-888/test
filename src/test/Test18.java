package test;
import org.junit.Test;

public class Test18  {
	
	//@Test ��Junit��������̲߳�����
	public void Demo61(){
		Test17 station1 = new Test17("����1");
		Test17 station2 = new Test17("����2");
		Test17 station3 = new Test17("����3");
		station1.start();
		station2.start();
		station3.start();
	}
	
	public static void main(String[] args) {
		Test17 station1 = new Test17("����1");
		Test17 station2 = new Test17("����2");
		Test17 station3 = new Test17("����3");

		station1.start();
		station2.start();
		station3.start();
	}
}
