//1.����Scanner
import java.util.Scanner;
public class Demo20Scanner 
{
	public static void main(String[] args) 
	{
		//2.����Scannerɨ����
		Scanner input = new Scanner(System.in);


		//3.��ȡ�������������
		System.out.println("������һ��С����");
		double num1 = input.nextDouble();//��ȡ�����������С��double���͵�
		System.out.println("��ȡ����С���ǣ�" + num1);

		

		System.out.println("������һ���ַ�����");
		String str = input.next();//��ȡ�����������һ���ַ���
		System.out.println("���յ����ַ����ǣ�" + str);

		System.out.println("������һ���ַ���");
		char c = input.next().charAt(0);//��ȡ����������ĵ����ַ�

		System.out.println(c);
		
	}
}
