import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// ����� ���� ���Ͽ� ��ȯ�ϴ� getSumOfDivisors() �޼ҵ� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է¹��� ���� >> ");
		int num = sc.nextInt();

		System.out.println(num + "�� ����� �� : " + getSumOfDivisors(num));
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
