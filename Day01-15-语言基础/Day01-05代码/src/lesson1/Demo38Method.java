public class Demo38Method {
	

	public static void main(String[] args) {
		/*
		 * ������ע��㣺
		 * 1������ֻ��������û�е��á��ǾͰ�д�ˡ�
		 * 2������û��������ֱ�ӵ��á���ô�����÷���δ���塣
		 * 3������������λ�ã�������������⡣�ؼ�����������á�
		 * 4��ͬһ�����У����������ܳ�ͻ��
		 * 
		 * ���䣺�ֲ������������������ı��������ĸ������������ı�������ֻ�����ĸ�������ʹ�á�������
		 */
		
		test2();
	}
	
	
	public static void test1(){
		System.out.println("test1()��������");
		int num = 100;
		test2();
		
	}
	public static void test2(){
		System.out.println("test2()��������");
//		System.out.println(num);//����
		test1();
	}
//	public static void test2(){
//		System.out.println("������һ������������");
//	}

}

