import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {
		// array 에 들어있는 데이터를 출력하는 arrayToString() 메소드 구현

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
	// Arrays 클래스의 toString() 함수 사용하기
	public static void arrayToString2(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
