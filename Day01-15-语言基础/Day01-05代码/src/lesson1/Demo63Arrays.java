//��ʾArrays�������ʹ��
import java.util.*;
class Demo63Arrays 
{
	public static void main(String[] args) 
	{
		//ʹ�ö�̬��ʼ���ķ�ʽ��ʼ��һ������
		int[] arr = new int[10];
		
		//1.���
		/*
		static void fill(int[] a, int val) 
          ��ָ���� int ֵ�����ָ�� int �������ÿ��Ԫ�ء� 
		static void fill(int[] a, int fromIndex, int toIndex, int val) 
          ��ָ���� int ֵ�����ָ�� int ������ָ����Χ�е�ÿ��Ԫ�ء� 

		*/
		/*
		for(int n:arr) {
			System.out.print(n);
		}
		*/
		//Arrays.fill(arr,10);

		//Java�����漰���������⣬һ����ɣ���ͷ����β   ǰ�պ�����
		Arrays.fill(arr,2,6,56);//0~arr.length - 1


		//2.����
		/*
		static void sort(int[] a) 
          ��ָ���� int �����鰴��������������� 
		static void sort(int[] a, int fromIndex, int toIndex) 
          ��ָ�� int �������ָ����Χ����������������� 
		*/
		//ע�⣺Ĭ�������ֻ�ܽ�����������
		int[] arr1 = {43,2,65,1,45,9898,989};
		Arrays.sort(arr1);
		//Arrays.sort(arr1,2,5);//[2,5)

		//3.���ַ�����
		//ǰ�᣺�������ź��������
		/*
		static int binarySearch(int[] a, int key) 
          ʹ�ö���������������ָ���� int �����飬�Ի��ָ����ֵ�� 
		static int binarySearch(int[] a, int fromIndex, int toIndex, int key) 
          ʹ�ö���������������ָ���� int ������ķ�Χ���Ի��ָ����ֵ�� 
		*/
		/*
		1
		2
		43
		45
		65
		989
		9898
		*/
		int key = 45;
		int result1 = Arrays.binarySearch(arr1,key);
		System.out.println(result1);//3

		int result2 = Arrays.binarySearch(arr1,20);
		//���ɣ�����ԭ����˳�򽫴����ҵ�Ԫ�ز��뵽ԭ�����е��±꣬���±��1Ȼ�����෴��
		System.out.println(result2);


		//4.����
		/*
		static int[] copyOf(int[] original, int newLength) 
          ����ָ�������飬��ȡ���� 0 ��䣨���б�Ҫ������ʹ��������ָ���ĳ��ȡ� 
		static int[] copyOfRange(int[] original, int from, int to) 
          ��ָ�������ָ����Χ���Ƶ�һ�������顣 
		*/
		int[] newArr1 = Arrays.copyOf(arr1,3);

		int[] newArr2 = Arrays.copyOfRange(arr1,2,6);

		//5.������ת��Ϊ�ַ���
		System.out.println(arr1);//[I@15db9742

		/*
		static String toString(int[] a) 
          ����ָ���������ݵ��ַ�����ʾ��ʽ�� 
		*/
		System.out.println(Arrays.toString(arr1));//[1, 2, 43, 45, 65, 989, 9898]

		//6.�Ƚ�����
		/*
		static boolean equals(int[] a, int[] a2) 
          �������ָ���� int ������˴���ȣ��򷵻� true�� 
		*/
		/*
		�������ָ���� int ������˴���ȣ��򷵻� true��
		����������������ͬ������Ԫ�أ��������������е�������ӦԪ�ضԶ�����ȵģ�����Ϊ��������������ȵġ�
		���仰˵�����������������ͬ˳�������ͬ��Ԫ�أ���������������ȵġ�
		���⣬��������������ö�Ϊ null������Ϊ��������ȵ�
		*/
		int[] array1 = {1,54,76};
		int[] array2 = {1,54,76};
		System.out.println(Arrays.equals(array1,array2));//true
		System.out.println(array1 == array2);//false

		/*
		�ܽ᣺
		==��equals
		==����һ������������ԱȽϻ����������ͺ������������͡����Ƚ������������͵�ʱ�򣬱Ƚϵĵ�ֵַ��
			�Ƚ�String���͵ı���������equals   
			String str1 = "";
			String str2 = "";
			�ȽϷ�ʽ��str1.equals(str2);
		equals����һ��������ֻ�ܱȽ�������������
		�����䣺���equals������һ������û��û����ʵ�֣���equals���������ú�==һ�������Ƚϵ��ǵ�ֵַ
		���equals������һ�����б�����ʵ�֣���Ƚϵ�������
		��
		*/

		for(int n:newArr1) {
			System.out.println(n);
		}
	}
}