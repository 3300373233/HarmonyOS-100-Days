public class  Demo65Array
{
	public static void main(String[] args) 
	{
		//1.����Խ��
		int[] arr1 = new int[]{2,65,76,83,32,5,5};
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
        at Demo65Array.main(Demo65Array.java:6)
		*/
		//System.out.println(arr1[8]);

		//2.��ָ���쳣
		System.out.println(arr1[3]);
		//arr1 = null;
		/*
		Exception in thread "main" java.lang.NullPointerException
        at Demo65Array.main(Demo65Array.java:20)
		*/
		//System.out.println(arr1[3]);

		//3.�����������ͺ������������ʹ�ӡ������
		int x = 4;
		System.out.println(x);//4
		System.out.println(arr1);//[I@15db9742

		/*
		��ӡ�����������͵����ñ���ʱ���õ����ǵ�ַ

		[I@15db9742

		[ ----- ����
		I ----- int��Integer��
		@ ------ ��ַ
		15db9742 ----- ʮ�����ƣ���ֵַ�Ĺ�ϣ���롾��ϣ�㷨��

		��ӡ��
		�����������ͣ���ֵ
		�����������ͣ���ֵַ
		*/

		float[] arr2 = new float[10];
		System.out.println(arr2);//[F@6d06d69c

		String[] arr3 = new String[10];
		System.out.println(arr3);//[Ljava.lang.String;@7852e922
	}
}