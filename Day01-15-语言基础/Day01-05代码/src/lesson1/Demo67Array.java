class Demo67Array 
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[3][4];
		
		System.out.println(arr);//��ά����ĵ�ַ��[[I@15db9742
		System.out.println(arr.length);//��ά����ĳ��ȣ�3
		System.out.println(arr[0]);//��ά�����е�һ��һά���飺[I@6d06d69c
		System.out.println(arr[0].length);//��һ��һά����ĳ��ȣ�4
		System.out.println(Arrays.toString(arr));//[[I@6d06d69c, [I@7852e922, [I@4e25154f]
		System.out.println(Arrays.toString(arr[0]));//[0, 0, 0, 0]

		/*
		[[I@15db9742
		3
		[I@6d06d69c
		4
		[[I@6d06d69c, [I@7852e922, [I@4e25154f]
		[0, 0, 0, 0]
		*/
	}
}