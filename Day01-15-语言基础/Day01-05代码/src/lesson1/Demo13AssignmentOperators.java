/**
*��ֵ�����
*/
public class Demo13AssignmentOperators 
{
	public static void main(String[] args) 
	{
		/*
		��ֵ�������=��+=��-=��*=��/=,%=
			=����=�Ҳ����ֵ����ֵ��=���ı���
			+=: a += b;//�൱�ڣ�a = a + b
			-=: a -= b;//�൱�ڣ�a = a - b
			*=��a *= b;//�൱�ڣ�a = a * b
			/=��a /= b;//�൱�ڣ�a = a / b
			%=��a %= b;//�൱�ڣ�a = a % b
		*/
		int a = 3;//��3�����ֵ����ֵ������a
		System.out.println(a);


		a += 2;//�൱�ڣ�a = a + 2�����ǽ�a��2���ٸ�ֵ��a
		System.out.println(a);//5

		a -= 1;//�൱�ڣ�a = a - 1
		System.out.println(a);//4


		a %= 2;//�൱�ڣ�a = a % 2
		System.out.println(a);//0

		a = 2;
		int b = 3;
		a *= ++b; // �൱��a =a*(++b)
		System.out.println(a);//8
		System.out.println(b);//4


	}
}
