class  Demo44
{
	public static void main(String[] args) 
	{
		int result =  add(10,20);
		System.out.println(result);

		System.out.println(add(11,22));

		//���һ����������ֵ����Ϊvoid�������ٵ��ú�����ͬʱֱ�Ӵ�ӡ
		// ����: �˴�������ʹ�� '��' ����
		//System.out.println(show(11,22));
		show(11,22);
	}

	/*
	2>��һ���з���ֵ�ĺ�����ʹ��return
			��������º����б������return
			return��������һ���������ֵ��������ֵ�����ͺͷ���ֵ���ͱ��뱣��һ��
			���ã������������������ҽ�����ֵЯ����������
	*/

	//���������������ĺ�
	public static int add(int a,int b) {
		int sum = a + b;
		//˭���ã����ظ�˭
		//returnÿ��ֻ��Я��һ�����ݷ���
		return sum;
	}

	public static void show(int a,int b) {

		int sum = a + b;
		System.out.println(sum);
	}
}