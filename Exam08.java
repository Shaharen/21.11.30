import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 약수의 합을 구하여 반환하는 getSumOfDivisors() 메소드 구현
		Scanner sc = new Scanner(System.in);

		System.out.print("입력받은 숫자 >> ");
		int num = sc.nextInt();

		System.out.println(num + "의 약수의 합 : " + getSumOfDivisors(num));
		getDivisor(num);

	}

	public static void getDivisor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
