public class Demo54Array 
{
	public static void main(String[] args) 
	{
		//1.��������
		int [] arr = {1,3,5,7,9};

		//2.��������
		int n0 = arr[0];
		int n1 = arr[1];
		int n2 = arr[2];
		int n3 = arr[3];
		int n4 = arr[4];


		//3.��forѭ��
		//i��ʾ�±꣬0~arr.length
		for(int i = 0;i < arr.length;i++) {
			int n = arr[i];
			System.out.println(n);
		}

		/*
		4.��ǿforѭ����foreach��
		JDK1.5֮��������
		�ŵ㣺���ڱ�������ͼ��ϣ�����ͨ�������±꣬�Ϳ���ֱ�ӷ���������߼����е�Ԫ��
		�﷨��
		for(Ԫ���������� ����������������) {
			System.out.println(������);
		}
		*/
		//�ײ㹤��ԭ�������±��ȡ����Ԫ��
		for(int num : arr) {
			System.out.println("��ǿforѭ���Ľ����" + num);
		}

		/*
		���ֱ�����ʽ��ѡ�񣺲���Ҫ֪���±ֻ꣬��Ҫ��ȡԪ��ֵ���������ǿforѭ��
		*/

		//���󣺴�ӡ�±�Ϊż����Ԫ��ֵ��ֻ�ܲ��ü�forѭ����
		for(int i = 0;i < arr.length; i++) {
			arr[i] = i*2;
		}
		for(int i =0;i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
