
//����
public class Demo41Return {

	public static void main(String[] args) {
		
		/*
		 * һ�������ķ���ֵ��һ������ִ��֮��Ľ�������ظ����ô���
		 * ����������ʱ�򣺱�ע����÷����ķ���ֵ���ͣ����û�з���ֵ��дvoid��
		 */
		// ��main�л�ȡ1-10�ĺͽ�����Ŵ�10������ӡ
		int res = getSum();//�൱��int res = sum
		System.out.println(res * 10);
	}

	/**
	 * һ����������з���ֵ����ô������ʱ��Ҫд�������ֵ���ͣ�ֻ��дһ����
	 * ���û�з���ֵ����дvoid
	 * �����б���ʹ��return��䷵����������
	 * @return
	 */
	public static int getSum() {//This method must return a result of type int
		int sum = 0;// �ֲ�������ֻ���ڸ÷�����ʹ��
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
//		System.out.println(sum);//55
		return sum;//��sum��ֵ�����ݸ������ĵ��ô�
	}

}

