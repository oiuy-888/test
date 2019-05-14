package test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test17 extends Thread{

	// 通过构造方法给线程名字赋值
	public Test17(String name){
		super(name);// 给线程名字赋值
	}
	// 为了保持票数的一致，票数要静态
	static int tick = 200;
	// 创建一个静态钥匙
	static Object ob="aa";

	// 重写run方法，实现买票操作
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tick>0){
			synchronized(ob){
				// 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
				if(tick>0){
					System.out.println(getName()+"卖出了第"+tick+"张票");
					tick--;
				}else{
					System.out.println(getName()+":售罄！");
				}
			}
			try {
//			 sleep(1);  //如果不休眠，因锁内程序较短，不容易表现出随机特性
		    } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
	    	}
		}
	}
	
}


