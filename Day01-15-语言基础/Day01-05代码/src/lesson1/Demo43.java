class Demo43 
{
	public static void main(String[] args) 
	{
		show();
	}
	/*
	1>��û�з���ֵ�ĺ�����ʹ��return
			return��������һ����䣬������break����continue�����治�ܸ��κε���ֵ
			���ã�������������
	*/
	public static void show() {
		System.out.println("Hello World!");

		int x = 10;
		if(x > 5) {
			return;//��ĳЩ����£�����ʹ��return�滻break
		}

		// ����: �޷����ʵ����
		System.out.println("Hello World!========");
	}
}