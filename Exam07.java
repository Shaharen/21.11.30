import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {
		// array �� ����ִ� �����͸� ����ϴ� arrayToString() �޼ҵ� ����

		int[] array = { 1, 3, 4, 8, 7, 9, 10 };

		arrayToString(array);
		System.out.println();
		arrayToString2(array);
	}

	public static void arrayToString(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	// Arrays Ŭ������ toString() �Լ� ����ϱ�
	public static void arrayToString2(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
