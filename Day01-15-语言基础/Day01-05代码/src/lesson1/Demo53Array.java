public class Demo53Array 
{
	public static void main(String[] args) 
	{
		//ʹ�þ�̬��ʼ���ķ�ʽ����һ������
		//�����п��Դ���ظ�����
		int[] arr1 = new int[]{2,65,76,83,32,5,5};

		//1.���������е�Ԫ��
		//��ʽ����������[�±�]    ��ʾ��ȡָ���±�����Ӧ��ֵ
		//���󣺻�ȡ�±�3��Ӧ��Ԫ��
		int num1 = arr1[3];
		System.out.println(num1);//83
		System.out.println(arr1[3]);//83

	
		//2.�޸�����Ԫ�ص�ֵ
		int num2 = arr1[6];
		System.out.println(num2);//5
		num2 = 100;
		System.out.println(num2);//100
		System.out.println(arr1[6]);//5
		
		//��ʽ����������[�±�] = ���޸�֮���ֵ
		//ע�⣺�����Ǿ�̬��ʼ�����Ƕ�̬��ʼ���������Բ������ַ�ʽ�޸�Ԫ�ص�ֵ
		arr1[6] = 100;
		System.out.println(arr1[6]);//100

		//3.����±곬������ĳ��ȣ����±�Խ���쳣
		//System.out.println(arr1[10]);

		//4.��ȡ�����е�Ԫ�ظ�����������ĳ���
		//��ʽ:��������.length;
		int len = arr1.length;
		System.out.println("����arr1�ĳ���Ϊ��" + len);	

	}
}
