/**
*λ����
*/
public class Demo16BitOperators 
{
	public static void main(String[] args) 
	{
		
		//1.��λȡ��
		//����һ��int���͵�����
		int a = 79;
		//��ʵ����Ӧ�Ķ����Ʊ�ʾ��0100 1111

		System.out.println(Integer.toBinaryString(a));
		
		
		int res = ~a;
		/*
		* ��λȡ����
		* a=79
		* ԭʼ�����ƣ�0100 1111
		* ��λȡ����1011 0000
		* ��ô���յļ�����������-80
		*/
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));

		//2.��λ��
		int x = -53;
		int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*��λ��
		*-53		1100 1011
		*109		0110 1101
		*��λ��		0100 1001
		*���Ϊ��73
		*/
		int res2 = x & y;
		System.out.println(res2);
		System.out.println(Integer.toBinaryString(res2));
		//3.��λ��
		//int x = -53;
		//int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*��λ��
		*-53		1100 1011
		*109		0110 1101
		*��λ��		1110 1111
		*���Ϊ��-17
		*/
		int res3 = x | y;
		System.out.println(res3);
		System.out.println(Integer.toBinaryString(res3));
		
		//4.��λ��
		//int x = -53;
		//int y = 109;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		/*
		*��λ���
		*-53		1100 1011
		*109		0110 1101
		*��λ���	1010 0110
		*���Ϊ��-90
		*/
		int res4 = x ^ y;
		System.out.println(res4);
		System.out.println(Integer.toBinaryString(res4));
		
		
	}
}

