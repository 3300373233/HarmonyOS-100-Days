class Demo61Search
{
	/*
	*˳����ң�������arr�У�����key��λ�ã�������ڷ����±꣬���򷵻�-1
	*/
	public static int orderSearch(int[] arr,int key){
		for(int i = 0;i < arr.length;i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr = {23,54,65,3,5,2,87};

		//���󣺲���65�������е�λ��
		int key = 65;

		int result = orderSearch(arr,key);

		System.out.println(result);
		
	}
}