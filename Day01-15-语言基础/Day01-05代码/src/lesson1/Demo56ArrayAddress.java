public class Demo56Array
{
	public static void main(String[] args) 
	{
		/*
		���飺�������͵�����
			���������洢�����õ�ַ��
		*/

		int[] a = new int[3];
		System.out.println(a.length);//3
		System.out.println(a);//a����ĵ�ַ
		System.out.println(a[0]);//0

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int[] b = {4,5,6,7};
		System.out.println(b.length);//4
		System.out.println(b);//b�ĵ�ַ
		System.out.println(b[0]);//4

		int[] c = a;//��a��ֵ��ֵ��c�����ǽ�a�洢������ĵ�ַ��ֵ��c
		//a��c�洢�ĵ�ַ��ͬ����ô��ָ����ͬһ������
		System.out.println(c.length);//3
		System.out.println(c);//a�ĵ�ַ
		System.out.println(c[0]);//1

		c[0] = 100;
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);


		b = c;

		b[1] = 200;
		System.out.println(a[1]);//200
		System.out.println(b[1]);//200
		System.out.println(c[1]);//200

		System.out.println("Hello World!");
	}
}

