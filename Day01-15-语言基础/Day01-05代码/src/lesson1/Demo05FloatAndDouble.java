public class Demo05FloatAndDouble 
{
	public static void main(String[] args) 
	{
		//1.�����ȸ�������float
		float f = 3.14f;
		System.out.println(f);

		//2.˫���ȸ�������double
		double d = 1.23;//java�е�С����Ĭ��������double
		System.out.println(d);


		//��ѧ������
		double d2 = 2000;//int,�������������͵��Զ�ת��
		System.out.println(d2);

		double d3 = 2000.0;//double
		System.out.println(d3);

		double d4 = 2E3;//�൱��2*10��3�η�
		System.out.println(d4);

		//1.7E308,�൱��1.7����10��308�η���17����307��0
		double d5 = 17000000000000000000000000.0;//double
		System.out.println(d5);


		//1.�������ͣ�IEEE754��׼��
	}
}
