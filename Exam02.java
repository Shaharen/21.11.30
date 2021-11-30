import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 1. 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();

		System.out.print("연산자 입력( + , - , * , / ) >> ");
		String op = sc.next();

		System.out.print("결과값 : " + cal(num1, num2, op));

	}

	// cal 메소드 정의 ( 사칙연산 확장 )
	public static int cal(int num1, int num2, String op) {
// 		다른 방법
		
		// 결과를 담을 수 있는 변수 생성
//		int result = 0;

		// 연산자 비교 하기
		if (op.equals("+")) {
			// 연산에 따른 작업 진행
			return num1 + num2;
		} else if (op.equals("-")) {
			return num1 - num2;
		} else if (op.equals("*")) {
//			result = num1 * num2;
			return num1 * num2;
		} else if (op.equals("/")) {
			return num1 / num2;
		} else {
			return -1;
		}

//		return result;
	}

}
