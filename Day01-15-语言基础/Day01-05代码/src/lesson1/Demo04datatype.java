public class  Demo04datatype
{
	public static void main(String[] args) 
	{
		//1.����byte���͵ı���
		byte num = 10;
		System.out.println(num);
		//�洢�Ĵ�С���������byte��ȡֵ��Χ���ͻᱨ����
		//byte num2 = 129;
		//System.out.println(num2);

		//2.short���͵ı�����
		short s = 129;//ȡֵ��Χ��-32768~32767����(65536����ֵ)
		System.out.println(s);

		//3.int���͵ı���
		int i = 1314;//ȡֵ��Χ��-2147483648~2147483647
		System.out.println(i);

		//4.long���͵ı���
		long l1 = 9223372036854775807L;//��L��ʾ����ֵ��long���͵�
		System.out.println(l1);


		int age = 19;
		long l2 = 100000000L;
	}
}
