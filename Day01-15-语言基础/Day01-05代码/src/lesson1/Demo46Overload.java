//��ʾ����������
//������
public class Demo46Overload 
{
	public static void main(String[] args) 
	{
		//�������غ������ԣ�������õ����ĸ�������ȡ���������Ĳ���
		Check.show("10");
		Check.show("10",10);
	}
}
//ʵ����
/*
��ͬһ�����У�����������µ����������Ϊ�⼸������֮��˴�����
		a.��������ͬ
		b.������ͬ��������ͬ�������Ͳ�ͬ��
		c.����Ȩ�����η��ͷ���ֵ����û��Ӱ��
*/
class Check
{
	public static void show() {
		System.out.println("�޲��޷���ֵ��show");
	}

	//1.�ı����
	public static void show(int a) {
		System.out.println("int��show");
	}

	public static void show(String a) {
		System.out.println("String��show");
	}

	public static void show(String a,int b) {
		System.out.println("String  int��show");
	}

	//2.�ı䷵��ֵ:����ֵ�Է���������û���κ�Ӱ��
	//ֻ�ı䷵��ֵ���ͣ����������ı䣬����ڱ��������ԣ�����Ϊ��ͬһ������
	/*
	public static String show() {
		System.out.println("String����ֵ��show");

		return "abc";
	}
	*/

	//3.����Ȩ�����η�
	//ֻ�ı����Ȩ�����η������������ı䣬����ڱ��������ԣ�����Ϊ��ͬһ������
	/*
	static void show() {
		System.out.println("show");
	}
	*/
}