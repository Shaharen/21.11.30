
public class Exam09_OverLoading {

	public static void main(String[] args) {
		// * 메소드 오버로딩 ( = 중복 정의 ) ==>> System.out.print();
		// 메소드의 이름은 하나만 주고 매개변수를 다르게 함으로써
		// 메소드를 여러개 만드는 기법
		
		int a = 10;
		int b = 2;
		double c = 2.4;
		
		// 두 수를 더해줄 수 있는 add() 만들기
		add(a,b);
		add(a,c);
	}
	// 기존의 add 함수
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// 정수형의 add메소드를 중복정의하여 생성된 메소드
	public static void add(int a, double b) {
		System.out.println(a+b);
	}
	
	// * 메소드 오버로딩의 조건
	// 1. 메소드 이름이 같아야함
	// 2. 매개변수의 개수 또는 타입이 달라야함
	// 3. 매개변수는 같고 리턴타입만 다를 경우 오버로딩 X

	// * 오버로딩의 장점
	// 1. 메소드이름의 낭비방지
	// 2. 같은 메소드에 여러 종류의 매개변수를 받을 수 있음
}
