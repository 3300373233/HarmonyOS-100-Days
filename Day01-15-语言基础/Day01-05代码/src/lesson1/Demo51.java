class Demo51 
{
	public static void main(String[] args) 
	{
		getNum(100);
		getNum1(10);
      	exchange();
	}

	//1.��1--ĳ����֮����Ա�7���������ĸ���
	public static int getNum(int n) {
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		return count;
	}

	//2.����1��ĳ���������ܱ�7����3����������ͬʱ�����������������ĸ�����
	public static int getNum1(int n) {
		//&&
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if((i % 7 == 0 || i % 3 == 0) && i % 21 != 0) {
				count++;
			}
		}

		//Ƕ��if���
		int count1 = 0;
		for(int i = 1;i <= n;i++) {
			if(i % 7 == 0 || i % 3 == 0) {
				if(i % 21 != 0) {
					count1++;
				}
			}
		}
		return count;
	}

	//3.�Ӽ�����������������ֵ����������������������������ֵ�����ַ�����
	public static void exchange() {
		int a = 10;
		int b = 20;

		//��ʽһ����������⣺�����õ�������������������������ֵ��
		a = a ^ b;   //10 ^ 20
		b = a ^ b;	 //10 ^ 20 ^ 20 = 10
		a = a ^ b;   //10 ^ 20 ^����������������

		//��ʽ�����ӷ�
		int c = a  + b;//30
		a = c - a;//30 - 10 =20
		b = c - a; //30 - 20 = 10

		a = a  + b;
		b = a - b;//10
		a = a - b;//20

		//��ʽ����
		int temp = a;
		a = b;
		b = temp;
	}
}