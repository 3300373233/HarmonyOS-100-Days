public class Demo37Method 
{

	public static void getSum(){
		//��1-100�ĺ�
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void printTriangle(){
		for(int i = 0;i<5;i++){
			for(int j = 0;j <= i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		/*
��ϰ1������һ����������static�ؼ��֡�������1-100�ĺ͡�������ڷ����д�ӡ���������е��ø÷���2�Ρ�

��ϰ2������һ��������û��static�ؼ��֡����ڴ�ӡһ�������Ρ��������е��ø÷���3�Ρ�
*/
		getSum();
		getSum();
		
		Demo56 d = new Demo56();
		d.printTriangle();
		d.printTriangle();
		d.printTriangle();
	}
}

