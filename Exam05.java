import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 2���� ������ �Է¹޾� ���� �� 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ�
		// �� ���� ��� 10���� ���̰� ���ٸ� 0
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		System.out.println("10�� ����� �� : " + close10(num1, num2));

	}

	public static int close10(int num1, int num2) {
		int dis1 = 10 - num1;
		int dis2 = 10 - num2;
		// Math class�� �ִ� ���밪 �Լ� abs() ����ϱ�
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
