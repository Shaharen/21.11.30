import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 1. ����ڷκ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		char op = sc.next().charAt(0);

		System.out.print("����� : " + cal(num1, num2, op));

	}
	// 2. char �̿�
	public static int cal(int num1, int num2, char op) {
		if (op == '-') {
			return num1 - num2;
		} else {
			return num1 * num2;
		}

	}

}
