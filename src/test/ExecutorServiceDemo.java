package test;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
	
	
public class ExecutorServiceDemo{
		
		public static void main(String[] args) {
			ExecutorService pool = Executors.newCachedThreadPool();//�ɱ�ߴ��̳߳�,�����������СΪInteger.MAX_VALUE=2147483647
//			ExecutorService pool = Executors.newSingleThreadExecutor();//�������̳߳�
//			ExecutorService pool = Executors.newFixedThreadPool(2);//�̶���С���̳߳�
			pool.submit(new Test19());//��ExecutorService�еķ��� �����ύһ������,����ֵ��future����  ���Ի�ȡִ�н��
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.submit(new Test19());
			pool.shutdown();//����һ��˳��رգ��ȴ�ִ����ǰ�ύ��������ɣ���������������
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

