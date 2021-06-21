import java.util.Arrays;
public class Demo62Search 
{
	/*
	* ���ֲ���
	*/
	public static int binarySearch(int[] arr,int key){
		//��Ӧ���±�
		int left = 0;
		int right = arr.length - 1;

		while(left <= right) {
			//�м��±�
			int middle = (left + right) / 2;//ȡ��
			if(arr[middle] > key) {
				//�´�����벿�ֲ���
				right = middle - 1;
			} else if(arr[middle] < key) {
				//�´����Ұ벿�ֲ���
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,7,8,10,13,14};

		//�����ҵ�Ԫ��
		int key = 13;

		int result = binarySearch2(arr,key);

		System.out.println(result);
		
	}
}
