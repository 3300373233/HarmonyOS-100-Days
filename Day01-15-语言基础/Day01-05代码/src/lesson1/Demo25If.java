public class Demo25If {

	public static void main(String[] args) {
		//����һ���Ա�����䣬�ж��Ƿ���Խ��
		//�У�����С��22����
		//Ů������С��20����
		
		char sex = '��';
		
		int age = 23;
		
		if(sex == '��'){
			//���ԣ�����
			if(age >= 22){
				System.out.println("����Ȣϱ���������ÿ��ġ���");
			}else{
				System.out.println("��С�أ��ٵȵȡ�����");
			}
		}else if(sex == 'Ů'){
			//Ů�ԣ�����
			if(age >= 20){
				System.out.println("�������ż��ˡ�����");
			}else{
				System.out.println("̫С�ˣ����ܼ��ˡ�����");
			}
		}else{
			System.out.println("�㲻����Ա𣬲��ܽ�顣��");
		}
		
	}

}

