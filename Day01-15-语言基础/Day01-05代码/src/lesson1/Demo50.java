class Demo50 
{
	public static void main(String[] args) 
	{
		method1();
      	method2(10);
	}
  public static void method1() {
    //���100~200֮���ܱ�3��������
	for(int i = 100;i <= 200;i++) {
		if(i % 3 != 0) {
			continue;
		}

		System.out.println(i);
	}
  }
  public static void method2(int num) {
    //�ж�һ�����Ƿ�Ϊ����
	//����������1�ͱ������������������һ�������Խ�����������Ļ�����ô������Ͳ�������
	//1.����������
	boolean isPrime = true;
	//2.Ѱ���ܹ�����num������ֻҪ����һ������ԭ���ļ��豻�Ʒ�
	for(int i = 2;i < num;i++) {
		//3.���С����
		if(num % i == 0) {
			//4.�޸�ԭ�������״̬
			isPrime = false;
			break;
		}
	}
	return isPrime;
  }
}