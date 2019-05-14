package test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
  
//		System.out.println("请输入");
//		Scanner in=new Scanner(System.in);
//		String str = in.nextLine();
//		char[] ch = str.toCharArray();
//		Count con = new Count();
//		con.count(ch);
//		Sum su = new Sum();
//		su.summ(ch);
		
//		Test3 test = new Test3();
//		test.demo36();
	}
}
class Count {
	int digital,character,blank,other;
	public void count(char[] arr){
		for (int i=0;i<arr.length;i++) {
			if((arr[i]>'a'&&arr[i]<'z')||(arr[i]>'A'&&arr[i]<'Z')){
				character++;
			}if(arr[i]>='0'&&arr[i]<='9'){
				digital++;
			}if(arr[i]==' '){
				blank++;
			}else{
				other++;
			}
		}
		System.out.println("数字个数："+digital);
        System.out.println("英文字母个数："+character);
        System.out.println("空格个数："+blank);
        System.out.println("其他字符个数："+other);
	}
}
class Sum{
	public void summ(char[] arr){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int[] a=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[i]){
					a[i]++;
				}
			}
			map.put(arr[i], a[i]);
		}
		//展示
		Iterator<Character> iter = map.keySet().iterator();
		while(iter.hasNext()){
		Character key=iter.next();
		Integer value = map.get(key);
		System.out.println(key+" 累计出现 "+value+"次");
		}
	}
}
