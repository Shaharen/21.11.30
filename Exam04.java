import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// �ΰ��� ����� �޾� �� ū ���ڸ� ��ȯ�ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		System.out.println("ū �� Ȯ�� : " + largeNumbers(num1, num2)); // 1)
		largeNumber(num1, num2); // 2)
		System.out.println("ū �� Ȯ�� : " + largeNumberss(num1, num2)); // 3)
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
			System.out.println("ū �� Ȯ�� : " + num1);
		} else if (num1 < num2) {
			System.out.println("ū �� Ȯ�� : " + num2);
		} else {
			System.out.println("ū �� Ȯ�� : " + "0");
		}
	}

	// 3) ���׿�����
	public static int largeNumberss(int num1, int num2) {
		return num1 == num2 ? 0 : (num1 > num2 ? num1 : num2);
	}
}
