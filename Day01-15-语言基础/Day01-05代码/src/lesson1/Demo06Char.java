public class Demo06Char 
{
	public static void main(String[] args) 
	{
		//�ַ����ͣ�char��ʹ�õ�����������
		char c = 'A';
		System.out.println(c);

		//ʹ�ñ���ֵ���д洢
		char c2 = 65;//65���ַ�A�ı���ֵ
		System.out.println(c2);

		//����unicode���룺16���Ƹ�ֵ
		char c3 = '\u0041';
		System.out.println(c3);

		char c4 = '��';
		System.out.println(c4);
		System.out.println((int)c4);//��c4����ַ�������ֵ��ӡ����ʵ���Ǹ��ַ��ı���ֵ

		char c5 = 20013;
		System.out.println(c5);//��

		char c6 = '��';//22269
		System.out.println((int)c6);

		char c7 = 22269;
		System.out.println(c7);
	}
}

