import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 1. 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();

		char op = sc.next().charAt(0);

		System.out.print("결과값 : " + cal(num1, num2, op));

	}
	// 2. char 이용
	public static int cal(int num1, int num2, char op) {
		if (op == '-') {
			return num1 - num2;
		} else {
			return num1 * num2;
		}

	}

}
