/**
*�߼������
*/
public class Demo15LogicalOperators
{
	public static void main(String[] args){
		/*
		�߼��������&��|,!,&&,||,^
		&��"�����"
			����������еĲ����������Ϊ�棬�����Ϊ�棬��һ��Ϊ�٣������Ϊ��

			�ܽ᣺�൱��"����"��һ����٣�ȫ����档
				Ů�����е�������һ������ȫ�̷񶨡�

		|��"�����"
			����������еĲ����������Ϊ�٣������Ϊ�٣���һ��Ϊ�棬�����Ϊ��

			�ܽ᣺�൱��"����"��һ�����棬ȫ�ٲż١�
				�������е�Ů����һ�����㣬��ȫ���⡣

		&&��"��·��"
			��������&��������ͬ�ġ�
			������̲�ͬ��&�Ὣ����ʽ�Ӷ����㣬��һ�����յĽ����
					      &&�ڼ�������У��������һ��false����ֱ�ӷ��ؽ��Ϊfalse������Ĳ��ټ����ˡ�

		||��"��·��"
			��������|��������ͬ�ġ�
			������̲�ͬ��|�Ὣ����ʽ�Ӷ����㣬��һ�����յĽ����
						  ||�ڼ�������У��������һ��true����ֱ�ӷ��ؽ��Ϊtrue������Ĳ��ټ���
		
		
		!��"ȡ�ǣ�ȡ��"
			!true--->false
			!false--->true

		^��"���"
			������򣺲�ͬΪ�棬��ͬ����Ϊ�١�
			��-->��ͬ
			�����������������ֵ��ͬ�����Ľ���Ǽ�
						�����ֵ��ͬ�����Ľ������
		*/
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		boolean res1 = b1 & b2 & b3;
		System.out.println(res1);//false

		boolean res2 = b1 | b2 | b3;
		System.out.println(res2);//true

		boolean res3 = b1 && b2 && b3;
		System.out.println(res3);//false

		boolean res4 = b1 || b2 || b3;
		System.out.println(res4);


		boolean b4 = true;
		System.out.println(b4);//true
		System.out.println(!b4);//false

		boolean res5 = b1 ^ b2;//���
		System.out.println(res5);//true
		boolean res6 = b1 ^ b3;
		System.out.println(res6);//false


	}
}