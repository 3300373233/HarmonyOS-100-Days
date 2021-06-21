/**
*λ������
*/
public class Demo17ShiftBitwiseOperators 
{
	public static void main(String[] args) 
	{
		int x = 2227;
		System.out.println(Integer.toBinaryString(x));
		/*
		*2227		00000000 00000000 00001000 10110011
		*����3λ	00000 00000000 00001000 10110011  000����λ��3��0
		*����3λ	000  00000000 00000000 00001000 10110����λ������3λ����λ��0
		*�޷�������		����ͬ����
		*
		*-2227		11111111 11111111 11110111 01001101
		*����3λ	11111 11111111 11110111 01001101  000����λ��3��0
		*����3λ	111  11111 11111111 11110111 01001101����λ������3λ����λ��1
		*�޷�������	000  11111 11111111 11110111 01001101����λ������3λ����λ��0	
		*/
		//����3λ
		int num1 = x << 3;
		System.out.println(num1);//17816
		System.out.println(Integer.toBinaryString(num1));//100010110011000
		//����3λ
		int num2 = x >> 3;
		System.out.println(num2);//278
		System.out.println(Integer.toBinaryString(num2));//100010110
		//�޷�������
		int num3 = x >>> 3;
		System.out.println(num3);//278
		System.out.println(Integer.toBinaryString(num3));//100010110

		System.out.println("-------");

		int y = -2227;
		System.out.println(Integer.toBinaryString(y));
		//����3λ
		int num4 = y << 3;
		System.out.println(num4);//-17816
		System.out.println(Integer.toBinaryString(num4));//11111111111111111011101001101000
		//����3λ
		int num5 = y >> 3;
		System.out.println(num5);//-279
		System.out.println(Integer.toBinaryString(num5));//11111111111111111111111011101001
		//�޷�������
		int num6 = y >>> 3;
		System.out.println(num6);//536870633
		System.out.println(Integer.toBinaryString(num6));//11111111111111111111011101001
		

		


		
	}
}

