import java.util.Scanner;

public class Demo23IfElse {

	public static void main(String[] args) {
		/*
		 * if ( �����ж� true or false ) { //���߱�ѡ��һ
		 * 
		 * // true����� 
		 * } else { 
		 * // false�����
		 * 
		 * }
		 * 
		 * ִ������: �������е�if-else�ṹʱ�������ж�if֮��������Ƿ�Ϊtrue�����Ϊtrue��ִ��if֮����������ݣ�true����壬
		 * ���Ϊfalse��ִ��else���������ݣ�false�����
		 */
			
		int score = 88;
		
		if(score >= 60){
			System.out.println(score+",����");
		}else{
			System.out.println(score+"�������񡣡���");
		}
		
		System.out.println("over...");
		//�ж��Ա��о�ȥ�в���������ȥŮ����
		
		/*
		 * ��չ���Ƚ���ֵ
		 * �����������ͣ�==���Ƚ���ֵ�Ƿ����
		 * 	8����������
		 * 
		 * �����������ͣ�equlas()���Ƚ������Ƿ����
		 * 	String
		 */
		System.out.println("����������Ա�");
		Scanner scan = new Scanner(System.in);
		String sex = scan.next();
		if("����".equals(sex)){
			System.out.println(sex+",ȥ�в�������");
		}else{
			System.out.println(sex+"��ȥŮ��������");
		}
		
		
		System.out.println("----------------");
		
		
		char sex2 = '��';
//		int sex3 = 1;//1�У�2Ů
//		boolean sex4 = true;//true�У�falseŮ
		
		if(sex2 == '��'){
			System.out.println("ȥ�в�������");
		}else{
			System.out.println("ȥŮ������������");
		}
		
		
		
	}

}

