/**
*���������
*/
public class Demo11ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		/*
		i++,++i������1
			i++��++i�����Ǹ�i���м�1����
			ִ�н�����i��ֵ�����1�ġ�

			���𣺹��̲�һ��
				i++��ֵ�൱��i����ִ��֮��i���Լ�����1.
					�ȼ��㣬�ټ�1

				++i��ֵ�൱��i+1.
					�ȼ�1���ټ���

		i--,--i���Լ�1
		*/
		//1.�������Լ�
		int x = 3;
		System.out.println(x);//3

		x++;//���Լ�����1
		System.out.println(x);//4

		x--;//���Լ��Լ�1
		System.out.println(x);//3
		System.out.println("-----------");
	
		//2��ǰ�Ӻͺ��
		int i = 3;
		System.out.println(i);//3
		System.out.println(i++);//3
		System.out.println(i);//4

		i = 3;
		System.out.println(++i);//4
		System.out.println(i);//4
		System.out.println("-----------");

		//3.������������
		int j = 2;
		int res = j++ + 3; //2 + 3=5
		System.out.println(res);//5
		System.out.println(j);//3

		j = 2;
		res = ++j + 3; //3 + 3
		System.out.println(res);//6
		System.out.println(j);//3

		i = 2;
		i = i++;
		System.out.println(i);//2
	}
}
