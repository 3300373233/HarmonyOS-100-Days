public class Demo57ArrayMethod
{

	//���һ�����������ڴ�ӡ����
	public static void printArray(int[] arr){//int[] arr = a;a�ĵ�ַ����arr����ôarr�� aָ��ͬһ���ڴ������
		for(int e : arr){
			System.out.print(e +"\t");
		}
		System.out.println();
	}

	//���һ�����������ڴ���һ�����飬 ����ֵ������Ҫ���ظ����ô�
	public static int[] createArray(int len){
		int[] arr = new int[len];
		for(int i = 0;i <arr.length;i++){
			arr[i] = i * 2;
		}
		return arr;
	}
	public static void main(String[] args) 
	{

		int[] a = {1,2,3,4,5};

		//���һ�����������ڴ�ӡ����
		printArray(a);//��a�ĵ�ַ�����ݸ�arr
		System.out.println("Hello World!");

		int [] b = createArray(10);

		for(int i =0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}