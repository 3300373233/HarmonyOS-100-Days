/*
*��ϵ�����
*/
public class Demo14RelationalOperators 
{
	public static void main(String[] args) 
	{
		/*
		��ϵ���������ʾ�������Ĺ�ϵ�ģ���������boolean���͵ġ�True,False
		>,<,>=,<=,==,!=

		==���Ƚ�������ֵ��ȡ������ȣ��������true���������false
		!=��
		*/
		int a = 4;
		int b = 4;
		boolean res = a > b;

		boolean res2 = a <= b;

		System.out.println(res);//true

		System.out.println(res2);//false

		boolean res3 = a == b;// 4 == 4,true
		System.out.println(res3);

		boolean res4 = a != b;// 4!= 4,false
		System.out.println(res4);//false
	}
}
