class Demo55Array 
{
	public static void main(String[] args) 
	{
		//ʹ�þ�̬��ʼ���ķ�ʽ��ʼ��һ������a
		int[] a = {5,7,20};
		System.out.println("a�ĳ���Ϊ��" + a.length);//3

		//ʹ�ö�̬��ʼ���ķ�ʽ��ʼ��һ������b
		int[] b = new int[4];
		System.out.println("b�ĳ���Ϊ��" + b.length);//4

		b = a;
		System.out.println("a�ĳ���Ϊ��" + a.length);//3
		System.out.println("b�ĳ���Ϊ��" + b.length);//3 

		String[] arr = new String[3];
	}
}