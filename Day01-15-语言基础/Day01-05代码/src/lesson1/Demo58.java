//��ʾ������������ʹ��
public class Demo58
{
	public static void main(String[] args) 
	{
		int result = add(2,5,65,76,87,98,9);
		System.out.println(result);

		//2.����һ�������Ĳ����ǲ���������ʱ��ʵ�ο���ֱ�Ӵ�һ������
		int[] arr = {2,5,65,76,87,98,9};
		System.out.println(add(arr));//num = arr;

		test(10,"hello",1,545,656);
		//test(1,545,656,"hello");
	}

	//���󣺼��㲻ȷ���������ĺ�
	public static int add(int... num) {
		//1.�������Ĳ����ڽ���ʹ�õ�ʱ�򱻵������������д���
		//num��ʵ���൱��һ����������ñ���
		int sum = 0;
		for(int n :num) {
			sum += n;
		}

		return sum;
	}

	//3.������������ʹ�õ�ʱ�򣬱�������ڲ����б�����һ��
	//4.��ͬһ�������б��У�����������ֻ�ܳ���һ��
	public static void test(int num1,String s,int... num) {
	}
}