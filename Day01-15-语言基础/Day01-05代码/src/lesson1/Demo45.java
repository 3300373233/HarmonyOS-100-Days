class  Demo45
{
	public static void main(String[] args) 
	{
		int result = compare(34,67);
		System.out.println(result);
	}
	/*
	3>���һ���Զ���ĺ����з���ֵ�������ڷ����������˷�֧�ṹ��ʹ��return
			��ÿһ����֧���涼��Ҫ����һ��return
	*/
	//���󣺱Ƚ����������Ĵ�С�����ؽϴ��һ��
	public static int compare(int num1,int num2) {
		//���֧
		/*
		if(num1 > num2) {
			return num1;
		} else if(num1 < num2) {
			return num2;
		} else {
			return num1;
		}
		*/

		//���ֵ����⣺��ʹ�õ���֧��ʱ�򣬷�֧�ڲ���return����ʱ���뻹�ǲ�ͨ��
		//����취���ڵ���֧�����������һ������ֵ������ֵ���⣬ֻҪ���ͺͷ���ֵ����ƥ���ok
		//����֧
		if(num1 > num2) {
			return num1;
		}

		//û��ʵ�����壬����ֻ��Ϊ��ƥ���﷨
		return 0;	 
	}
}