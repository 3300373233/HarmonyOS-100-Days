public class Demo26Switch {

	public static void main(String[] args) {
		/*
		 * switch-case	��䣺ѡ��ṹ�������֧ѡ��һ��ִ�С�
		 * 
		 * �﷨�ṹ��
		 * switch(���ʽ/����){//byte,short,int,char,enum,String
		 * 
		 * case ��ֵ1����֧1��
		 * 	break��
		 * 
		 * case ����2����֧2��
		 * 	break��
		 * 
		 * case ��ֵ3����֧3��
		 * 	break��
		 * ������
		 *  default�����һ����֧��
		 *  break��
		 * }
		 * 
		 */
		/*
		 * ��Ŀ��һ�ܵ�ʳ�ף�ÿ���ɶ
		 * ��һ��������
		 * �ܶ���������
		 * �������ȸ���
		 * ���ģ�ը����
		 * ���壺������
		 * ������������
		 * ���գ����
		 */
		
		int weekDay = 3;
		
		switch(weekDay){
		
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("�ȸ���");
			break;
		case 4:
			System.out.println("ը����");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("���");
			break;
		default:
			//���Ĳ�����ǰ���case�����û��ƥ���ϣ���ôִ���������default��䡣
			System.out.println("��Ϣ���󡣡�");
			break;
		
		}
		
		System.out.println("over....");
	}

}

