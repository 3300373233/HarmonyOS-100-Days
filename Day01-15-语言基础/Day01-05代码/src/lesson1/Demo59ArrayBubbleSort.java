public class Demo59ArrayBubbleSort
{
	public static void main(String[] args) 
	{
		int[] arr = {54,26,93,17,77,31,44,55,20};
		//������Ϊ��
		//���ѭ�������ƱȽϵ�����
		for(int i = 0;i < arr.length - 1;i++) {
			//�ڲ�ѭ��������ÿһ�ֱȽϵĴ����Ͳ���Ƚϵ��±�
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j + 1]) {
					//����λ��
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for(int num:arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
}