package test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test17 extends Thread{

	// ͨ�����췽�����߳����ָ�ֵ
	public Test17(String name){
		super(name);// ���߳����ָ�ֵ
	}
	// Ϊ�˱���Ʊ����һ�£�Ʊ��Ҫ��̬
	static int tick = 200;
	// ����һ����̬Կ��
	static Object ob="aa";

	// ��дrun������ʵ����Ʊ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tick>0){
			synchronized(ob){
				// �������Ҫ������ʹ��һ������
                // ��ȥ���˻��Կ���������ϣ�������Ű�Կ�����ó���
				if(tick>0){
					System.out.println(getName()+"�����˵�"+tick+"��Ʊ");
					tick--;
				}else{
					System.out.println(getName()+":������");
				}
			}
			try {
//			 sleep(1);  //��������ߣ������ڳ���϶̣������ױ��ֳ��������
		    } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
	    	}
		}
	}
	
}


