public class Demo12ArithmeticOperators
{
	public static void main(String[] args) 
	{
		int num = 520;
		String msg = "����";
		System.out.println(msg + num);


		int a = 3;
		int b = 2;
		//��ӡa��b�ĺͣ�Ϊ5
		System.out.println(a + b);//5
		//�˴���Ϊ����""�����ˣ� ��ô�����+������������
		System.out.println(a + " + " + b + " = " + a + b);//3 + 2 = 32
		//����a��b�����Գ�����С����������
		System.out.println(a + " + " + b + " = " + (a + b));//3 + 2 = 5
	}
}
