import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 1. ����ڷκ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		System.out.print("������ �Է�( + , - , * , / ) >> ");
		String op = sc.next();

		System.out.print("����� : " + cal(num1, num2, op));

	}

	// cal �޼ҵ� ���� ( ��Ģ���� Ȯ�� )
	public static int cal(int num1, int num2, String op) {
// 		�ٸ� ���
		
		// ����� ���� �� �ִ� ���� ����
//		int result = 0;

		// ������ �� �ϱ�
		if (op.equals("+")) {
			// ���꿡 ���� �۾� ����
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
