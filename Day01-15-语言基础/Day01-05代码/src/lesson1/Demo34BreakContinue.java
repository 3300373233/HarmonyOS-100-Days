public class Demo34BreakContinue {

	public static void main(String[] args) {
		/*
		 * ѭ����ν���?
		 * 
		 * ��������£�ѭ��������������ѭ�����Զ������ˡ�
		 * 
		 * break�����塰���ƣ��ƻ��� 
		 * 
		 * �÷�һ����switch-case����У����ڽ���switch���
		 * 
		 * �÷�������ѭ������У�һ��ѭ���У�һ��ִ����break��䣬��ô��ѭ���ͳ��׵Ľ����ˣ�����ѭ�������Ƿ����㡣
		 * 
		 * continue������"����"
		 * 	ѭ���У����ڽ���ĳһ��ѭ�����´μ���ִ�С�
		 * 	"����"����˼
		 * 
		 */

		for (int i = 1; i <= 10; i++) {
			if(i == 5){
//				break;//ǿ�ƽ���ѭ��
				continue;
			}
			System.out.println(i);
		}
		System.out.println("over...");
	}

}

