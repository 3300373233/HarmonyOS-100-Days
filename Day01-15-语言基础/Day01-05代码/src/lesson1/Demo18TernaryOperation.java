/**
*��Ԫ�����
*/
public class Demo18TernaryOperation 
{
	public static void main(String[] args) 
	{
		/*
		��Ԫ�������Ŀ�ģ�����������ѡ��һ�ֽ����
		�������
			  ?   :
			X ? Y : Z
			X���������͵ı��ʽ��true/false
			Y�����1
			Z�����2

			X��ֵΪtrue����ô������Ԫ������������Y��
			X��ֵΪfalse����ô������Ԫ������Ľ������Z��
		*/
		int score = 59;
		String res = score == 100 ? "����" : "��������";
		System.out.println(res);

		//����һ���ɼ����ж��Ƿ񼰸񣿼��񣬲�����

		String res2 = score >= 60 ? "����" : "������";
		System.out.println(res2);


		String res3 = !(score < 60) ? "����" :"������";
		System.out.println(res3);

		//����һ����ֵ���ж����������Ǹ���������0
		int num = -5;
		String res4 = num > 0 ? "����" : num < 0 ? "����" : "0";
		System.out.println(res4);


	}
}
