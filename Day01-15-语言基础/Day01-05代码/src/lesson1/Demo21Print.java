public class Demo21Print 
{
	public static void main(String[] args) 
	{
		/*
		��ӡ��System.out.xxxx()
		1��println();print + line ����ӡ����

		2��print();ֻ�Ǵ�ӡ��������

		3����չ���ݣ�
			printf();print+format ����ʽ����ӡ
		*/

		System.out.println("Hello World!");//print + line ����ӡ����
		System.out.println("���򿧣�");
		System.out.println();//ֻ�ǻ���
		System.out.println("������");
		System.out.print("��С��");
		System.out.print("������");

		System.out.println();

		String name = "������";
		int age = 100;
		double score = 88.7;


		System.out.printf("������%s�����䣺%d �꣬������%.2f\n",name,age,score);//ռλ����ʹ��һ�����ţ�ռ������ض�
		System.out.println("main..over..");
	}
}
