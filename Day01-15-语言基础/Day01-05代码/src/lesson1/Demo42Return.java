public class Demo42Return {

	public static void main(String[] args) {
		/*
		 * return��䣺
		 * 	�÷���1����������ظ����ô���2�������÷�����ִ�С�
		 * 
		 * 
		 * ע��㣺
		 * 1�����һ�����������з���ֵ(����void)����ô�����б���ʹ��return��䣬���ؽ����
		 * 
		 * 2�����������ķ���ֵ���ͣ���return�������������һ�¡����ǰ�����Щ�ܹ��Զ�ת�͵�����
		 * ����ֵ����int��int��byte��short��char
		 * ����ֵ����double��byte��short��int��long��float��double
		 * 
		 * 3�����һ�����������з���ֵ���������з�֧��䣬ѭ����䡣������ִ���ĸ���֧��������return������ִ�С�
		 * 
		 * 4��return���ڷ��ؽ������ǿ�ƽ����÷�����ִ�С�ϰ����return��������Ƿ����е����һ�д��롣
		 * 
		 * 5�����һ����������û�з���ֵ���ͣ�void��������
		 */
//		System.out.println(test1());
//		  System.out.println(test5());
//		  
//		  test6();
		test7();
	}
	
	public static int test1(){
		return 200;
	}
	
	public static int test2(){
		byte i = 100;
		return i;
	}
	
	public static int test3(){
		int age = 30;
		if(age < 0){//if,switch,for,while,do-while
			return 0;
		}else{
			return age;
		}
	}
	public static int test4(){
		return 0;//���ؽ�����������÷�����ִ�С�
//		System.out.println("haha");
	}
	
	public static int test5(){
		int age = 10;
		if(age < 0){
			return 0;//���ؽ������������
		}
		System.out.println("...."+age);
		return age;
	}
	
	public static void test6(){
		int age = -30;
		if( age < 0){
			return ;//û�з��أ�ֻ���ڽ�������
		}
		System.out.println("������䣺"+age);
	}
	
	public static void test7(){
		for(int i=1;i<=10;i++){
			if (i==5){
//				break;//ǿ�ƽ���ѭ�����
				return;
			}
			System.out.println(i);
		}
		System.out.println("test7..over...");
	}

}

