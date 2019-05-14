package test;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
	
	
public class ExecutorServiceDemo{
		
		public static void main(String[] args) {
			ExecutorService pool = Executors.newCachedThreadPool();//可变尺寸线程池,缓冲池容量大小为Integer.MAX_VALUE=2147483647
//			ExecutorService pool = Executors.newSingleThreadExecutor();//单任务线程池
//			ExecutorService pool = Executors.newFixedThreadPool(2);//固定大小的线程池
			pool.submit(new Test19());//是ExecutorService中的方法 用以提交一个任务,返回值是future对象  可以获取执行结果
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.shutdown();//启动一次顺序关闭，等待执行以前提交的任务完成，但不接受新任务
		}
	}
	
	
	
class Test19 implements Runnable {
		@Override
		public void run() {
			// TODO Auto-generated method stub
	        for(int i=0;i<10;i++){
	        	System.out.println(Thread.currentThread().getName() + ":" + i);
//	        	System.out.println(Integer.MAX_VALUE);
	        }
		}	
	}

