import java.util.Arrays;

public class Demo64ArrayCopy {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		int[] b = new int[10];
		//����Ŀ�����
		//����һ���Լ�ͨ��ѭ�����θ��ƣ��������
		for(int i=0;i<a.length;i++){
			b[i] =a[i];
		}
		
		for(int e :b){
			System.out.println(e);
		}
		System.out.println("---------");
		
		//��������������Arrays��
		/*
		 * copyOf(int[] ԭʼ���飬int ������ĳ���)
		 * ����ֵ�����µ�����
		 * 
		 */
		int[] c = Arrays.copyOf(a, 5);//int[] c = {1,2,3,0,0}
		for(int e:c){
			System.out.println(e);
		}
		
		
		System.out.println("--------");
		//��������������System��
		/*
		 * arraycopy(src, srcPos, dest, destPos, length)
		 * ��һ��������ԭʼ����
		 * �ڶ�����������ԭʼ������ĸ��±꿪ʼ����
		 * ������������Ŀ������
		 * ���ĸ�������Ŀ��������ĸ��±꿪ʼ��
		 * �����������������������
		 */
		//int[] a = {1,2,3};
		int [] d = new int[10];
		System.arraycopy(a, 1, d, 5, 2);
		for(int e:d){
			System.out.print(e+"\t");
		}
		
	}

}

