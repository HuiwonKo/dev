import java.util.Scanner;
public class BitTest {
	public static void main(String[] args) {
		int num, bitNum, result_bit, result_mul;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("0�� �ƴ� ������ ������ �Է��ϼ���.");
		num = keyboard.nextInt();
		System.out.println("<< ��Ʈ ������ ���� ������ �Է��ϼ���.");
		bitNum = keyboard.nextInt();
		result_bit = num << bitNum;
		result_mul = num * (int)(Math.pow(2, bitNum));
		System.out.println("��Ʈ ������ ��� ��ȣ ��ȭ�� ���� ��� MSB(Most Significant Bit)�� ���� ��ȭ�� ����Ƿ� 2�� ����� ���� �Ͱ� �ٸ� ����� ���´�.");
		if (num>0 && result_bit>0){
		System.out.println("�ùٸ� ��� ");
		System.out.println(num+"<<"+bitNum+" �� ����� "+result_bit+"�Դϴ�.");
		System.out.println(num+"*(2��"+bitNum+"��) �� ����� "+result_mul+"�Դϴ�.");
		}
		else if (num>0 && result_bit<0){
		System.out.println("�߸��� ���");
		System.out.println(num+"<<"+bitNum+" �� ����� "+result_bit+"�Դϴ�.");
		System.out.println(num+"*(2��"+bitNum+"��) �� ����� "+result_mul+"�Դϴ�.");
		}
		else if (num<0 && result_bit<0){
		System.out.println("�ùٸ� ��� ");
		System.out.println(num+"<<"+bitNum+"�� ����� "+result_bit+"�Դϴ�.");
		System.out.println(num+"*(2��"+bitNum+"��) �� ����� "+result_mul+"�Դϴ�.");
		}
		else{ 
		System.out.println("�߸��� ���");
		System.out.println(num+"<<"+bitNum+" �� ����� "+result_bit+"�Դϴ�.");
		System.out.println(num+"*(2��"+bitNum+"��) �� ����� "+result_mul+"�Դϴ�.");
		}
		}
}
