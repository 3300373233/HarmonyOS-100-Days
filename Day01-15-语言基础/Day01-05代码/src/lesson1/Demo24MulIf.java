public class Demo24MulIf {

	public static void main(String[] args) {
		/*
		 * ����if��䣺��ѡһ
		 * if(����1){
		 * 	//����1������ִ�д˴��Ĵ��룬����Ĵ��붼��ִ����
		 * 
		 * }else if(����2){
		 * 	//����1������������2������ִ�д˴����롣��
		 * 
		 * }else if(����3){
		 * 	//����1,2��������������3������ִ�д˴����롣����
		 * 	
		 * }������
		 */
		
		String sex = "��";
		
		if("����".equals(sex)){
			System.out.println("�в�������"+sex);
		}else if("Ů��".equals(sex)){
			System.out.println("Ů��������"+sex);
		}else{
			System.out.println("��Ҳ��֪���ˣ� Ҳ��ȥ�����ɡ���");
		}
		
		System.out.println("over..");
	}

}

