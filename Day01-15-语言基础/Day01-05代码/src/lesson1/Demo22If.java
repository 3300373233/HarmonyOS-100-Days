import java.util.Scanner;

public class Demo22If {

	public static void main(String[] args) {
		/*
		 * if (�����ж� true or false ) { // �������Ϊtrueִ�д��������ڵ����
		 * 
		 * }
		 * 
		 * ִ�����̣� �������е�if��֧�ṹ�������ж�if֮��������Ƿ�Ϊtrue�����Ϊtrue��ִ�д������������䣬
		 * ���Ϊfalseֱ��ִ�д�����֮�����䣬
		 * 
		 */
		// 1.����һ���ɼ���������ڵ���60����ӡ����
		int score = 88;
		if (score >= 60) {
			// �������Ϊtrueִ�д��������ڵ����
			System.out.println("���񡣡�");
		}
		
		System.out.println("over....");
		
		//2.����һ���������������0����ӡ����
		
		System.out.println("������һ��������");
		Scanner scan =new Scanner(System.in);
		
		int num = scan.nextInt();

		
		if(num > 0){
			System.out.println(num + ",����������");
			
		}
		
		System.out.println("over.........");

	}

}

