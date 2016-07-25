import java.util.Scanner;
public class BitTest {
	public static void main(String[] args) {
		int num, bitNum, result_bit, result_mul;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("0이 아닌 임의의 정수를 입력하세요.");
		num = keyboard.nextInt();
		System.out.println("<< 비트 연산을 위한 정수를 입력하세요.");
		bitNum = keyboard.nextInt();
		result_bit = num << bitNum;
		result_mul = num * (int)(Math.pow(2, bitNum));
		System.out.println("비트 연산의 결과 부호 변화가 있을 경우 MSB(Most Significant Bit)의 값에 변화가 생기므로 2의 배수를 곱한 것과 다른 결과가 나온다.");
		if (num>0 && result_bit>0){
		System.out.println("올바른 결과 ");
		System.out.println(num+"<<"+bitNum+" 의 결과는 "+result_bit+"입니다.");
		System.out.println(num+"*(2의"+bitNum+"승) 의 결과는 "+result_mul+"입니다.");
		}
		else if (num>0 && result_bit<0){
		System.out.println("잘못된 결과");
		System.out.println(num+"<<"+bitNum+" 의 결과는 "+result_bit+"입니다.");
		System.out.println(num+"*(2의"+bitNum+"승) 의 결과는 "+result_mul+"입니다.");
		}
		else if (num<0 && result_bit<0){
		System.out.println("올바른 결과 ");
		System.out.println(num+"<<"+bitNum+"의 결과는 "+result_bit+"입니다.");
		System.out.println(num+"*(2의"+bitNum+"승) 의 결과는 "+result_mul+"입니다.");
		}
		else{ 
		System.out.println("잘못된 결과");
		System.out.println(num+"<<"+bitNum+" 의 결과는 "+result_bit+"입니다.");
		System.out.println(num+"*(2의"+bitNum+"승) 의 결과는 "+result_mul+"입니다.");
		}
		}
}
