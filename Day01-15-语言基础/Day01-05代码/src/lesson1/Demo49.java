class Demo49 
{
	public static void main(String[] args) 
	{
		int result = total(100);
		System.out.println(result);
	}

	//������1~ĳ����֮�����������ĺ�
	//��ͨ��ʽ
	public static int add(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum += i;
		}
		return sum;
	}

	//ʹ�õݹ�ʵ��
	/*
	total(1) = 1
	total(2) = total(1) + 2
	total(3) = total(2) + 3 = total(1) + 2 + 3
	....
	total(n) = total(n - 1) + n
	*/
	public static int total(int n) {
		if(n == 1) {
			return 1;
		} else {
			return total(n - 1) + n;
		}
	}
}