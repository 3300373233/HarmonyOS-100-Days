/*
���������
*/
public class Demo10ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		/*
		�����������+��-��*��/,%,++,--
		*/
		int a = 10;
		int b = 3;
		//1.��������
		System.out.println(+a);
		System.out.println(-b);
		//2.�Ӽ��˳�
		int sum = a + b;//��a+b�ĺͣ��������ֵ��sum����
		System.out.println(sum);
		int sub = a - b;//��a-b
		System.out.println(sub);
		int mul = a * b;//��aXb
		System.out.println(mul);
		//������ȡ�̣�ȡ��
		int div = a / b;//ȡ��
		System.out.println(div);//3

		int mod = a % b;//ȡ�࣬ȡģ
		System.out.println(mod);//1

	}
}
