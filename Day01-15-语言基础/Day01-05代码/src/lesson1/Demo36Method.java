/*
* ����
*/
public class Demo36Method {	
	/**
	 * main��������ͬ��������������һ�������Ψһ����ڡ�JVM�Զ�ִ��main()�����е����ݡ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//1.�˴���1-10�ĺ�
		//step2:���÷�����������()
		getSum();//�����ĵ��ô�
		System.out.println("�����Ĵ��롣������10�С�����");
		//2.�˴���1-10�ĺ�
		getSum();
		
		System.out.println("Hello world������");
		//3.��1-10�ĺ�
		getSum();
	}

	//step1������һ��������Ҳ�з���������
	/*
	 * ()�������ı�־
	 * []������
	 * <>������
	 * {}��һ�δ��룬һ���࣬һ��������һ�������
	 * 
	 * ��������С�շ�������ʽ
	 * ע��㣺����������ʱ�򣬷�����Ĵ��벻�ᱻִ�еġ�
	 */
	public static void getSum(){
		int sum = 0;
		for(int i = 1;i<=10;i++){
			sum += i;
		}
		System.out.println("1-10�ĺͣ�"+sum);
	}
}