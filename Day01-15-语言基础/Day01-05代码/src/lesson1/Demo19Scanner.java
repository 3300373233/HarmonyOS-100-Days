//step1������Scanner
import java.util.Scanner;//����java.util����Scanner����࣬��ô�ڳ����оͿ���ʹ��Scanenr��

public class Demo19Scanner
{
	public static void main(String[] args){
		//step2������һ��ɨ�������󣬲ſ��Զ�ȡ��������
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĳɼ�(����)��");

		//step3����ȡ������������ݣ�
		int score = input.nextInt();//��ȡ�����������һ������
		
		System.out.println("��ĳɼ��ǣ�" + score);

		String msg = score >= 60? "����" : "������";
		System.out.println("�ɼ�Ϊ��" + msg);
	}
}