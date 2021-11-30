import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력받아 num1에서 num2를 뺀 결과값을
		// 절대값으로 바꾸어 출력하는 getAbsoluteValue() 메소드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);

	}
	
	
	public static int getAbsoluteValue ( int num1, int num2) {
		return Math.abs(num1 - num2);
	}

}
