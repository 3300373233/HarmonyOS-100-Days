//��ʾ������ʹ��
class Demo40 
{
	public static void main(String[] args) 
	{
		//���󣺽�������������ֵ

		//ʵ��
		int a = 10;
		int b = 20;
		
		//���ú���
		swap(a,b);

		System.out.println("main�����е�a=" + a);//10
		System.out.println("main�����е�b=" + b);//20
	}

	//��������Ҫ����������������
	//		����Ҫ����ֵ
	//�βΣ�û��Я��ֵ�ı������������֮��ʹ�ö��ŷָ�
	public static void swap(int a,int b) {
		//����һ���м����ʱ����
		int temp = 0;
		temp = a;
		a = b;
		b = temp;

		System.out.println("swap�����е�a=" + a);//20
		System.out.println("swap�����е�b=" + b);//10
	}
}