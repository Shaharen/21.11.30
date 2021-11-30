import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 두개의 양수를 받아 더 큰 숫자를 반환하는 메소드
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();

		System.out.println("큰 수 확인 : " + largeNumbers(num1, num2)); // 1)
		largeNumber(num1, num2); // 2)
		System.out.println("큰 수 확인 : " + largeNumberss(num1, num2)); // 3)
	}

	// 1) int
	public static int largeNumbers(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else if (num1 < num2) {
			return num2;
		} else {
			return 0;
		}
	}

	// 2) void
	public static void largeNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("큰 수 확인 : " + num1);
		} else if (num1 < num2) {
			System.out.println("큰 수 확인 : " + num2);
		} else {
			System.out.println("큰 수 확인 : " + "0");
		}
	}

	// 3) 삼항연산자
	public static int largeNumberss(int num1, int num2) {
		return num1 == num2 ? 0 : (num1 > num2 ? num1 : num2);
	}
}
