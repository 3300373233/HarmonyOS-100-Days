class  Demo48Fibonacci
{
	public static void main(String[] args) 
	{
		/*
		쳲���������
		1,2,3,4,5,6, 7, 8, 9,10,11,.....
		1,1,2,3,5,8,13,21,34,55,89....

		������
		1.��һ��λ�ú͵ڶ���λ���ϵ����ǹ̶��ģ�����1
		2.��n��λ���ϵ��� = ��n - 1��λ���ϵ��� + ��n - 2��λ���ϵ���

		fun(1)  = 1
		fun(2) = 1
		fun(3) = fun(2) + fun(1) = 1  + 1
		fun(4) = fun(3) + fun(2) = fun(2) + fun(1) +fun(2)
		fun(5) = fun(4) + fun(3) = fun(3) + fun(2) + fun(2) + fun(1) = fun(2) + fun(1) + fun(2) + fun(2) + fun(1)
		....
		fun(n) = fun(n - 1) + fun(n -2)
		*/

		int result1  = fun(10);
		System.out.println(result1);
	}
	//���󣺱���������ȡ��쳲����������ж�Ӧ����
	public static int fun(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			int num1 = fun(n - 1);
			int num2 = fun(n -2);
			int sum = num1  + num2;

			System.out.println("num1=" + num1 + ",num2=" + num2);
			return sum;
		}
	}
}