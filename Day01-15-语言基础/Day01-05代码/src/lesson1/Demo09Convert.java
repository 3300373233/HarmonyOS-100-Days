public class Demo09Convert 
{
	public static void main(String[] args) 
	{
		//1.�Զ�����ת����ȡֵ��ΧС���Զ�תΪȡֵ��Χ��ġ�
		short s1 = 123;//
		int i1 = s1;//�����Ž�s1�����ֵ��short����תΪint���ٸ�ֵ��i1�������
		System.out.println(s1);
		System.out.println(i1);

		byte b1 = 10;
		int i2 = b1;//byte-->int
		System.out.println(i2);

		//2.ǿ������ת��
		//byte��ȡֵ��Χ��-128~127֮��
		byte b2 = (byte)s1;//��s1��short���ͣ�ǿ��תΪbyte���ͣ��ٸ�ֵ��byte���͵ı���b2
		System.out.println(b2);//123

		short s2 = 128;
		byte b3 = (byte)s2;//-128
		System.out.println(b3);

		double d1 = 2.5;
		int i3 = (int)d1;//ǿ��ת�������㵽������ֱ�ӽ�ȡ�������֣�����С��
		System.out.println(i3);

		long l1 = 100L;
		float f1= l1;
		System.out.println(f1);


	}
}
