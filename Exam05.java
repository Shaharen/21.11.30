import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 숫자 중 10에 더 가까운 수를 반환하는 메소드
		// 두 숫자 모두 10과의 차이가 같다면 0
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();

		System.out.println("10에 가까운 수 : " + close10(num1, num2));

	}

	public static int close10(int num1, int num2) {
		int dis1 = 10 - num1;
		int dis2 = 10 - num2;
		// Math class에 있는 절대값 함수 abs() 사용하기
		int a = Math.abs(10 - num1);
		int b = Math.abs(10 - num2);
		
		if (dis1 < 0) {
			dis1 = -dis1;
		}
		if (dis2 < 0) {
			dis2 = -dis2;
		}
		if (dis1 > dis2) {
			return num2;
		} else if (dis1 < dis2) {
			return num1;
		} else if (dis1 == dis2) {
			return 0;
		}
		return -1;

	}

}
