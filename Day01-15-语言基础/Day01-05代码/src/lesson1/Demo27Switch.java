public class Demo27Switch {

	public static void main(String[] args) {
		/*
		 * switch-case����ע��㣺
		 * 1��switch��if��ͬ��
		 * 		if������boolean�����ϡ�
		 * 		switch������int��char��byte��short��enum��String��Щ�����ϡ�
		 * 
		 * 2��default��䣬�ǿ�ѡ�ġ�
		 * 
		 * 3��case�����ֵ��������Ψһ�ġ�
		 * 
		 * 4��case��û��˳��ġ�
		 * 
		 * 5��break��䣺����"���ƣ����飬�ƻ�"����˼�����ڷ�ֹswitch�Ĵ�͸��
		 * 
		 * 		switch�Ĵ�͸��ĳ��caseƥ��ɹ�֮��ִ�и�case������ݣ�����break������
		 * 		�������û��break��䣬��ô�����case����ƥ���ˣ�ֱ��ִ�У��������ͽ���switch�Ĵ�͸��
		 * 	
		 */
		/*
		 * ��1��3��5��������
		 * ��2��4��6������
		 * ��7������
		 */
		
		int weekday = 1;
		
		switch (weekday) {
		case 1:
		case 3:
		case 5:
			System.out.println("������");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		default:
			System.out.println("��Ϣ����");
			break;
		}
	}

}

