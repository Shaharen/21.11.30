
public class Exam09_OverLoading {

	public static void main(String[] args) {
		// * �޼ҵ� �����ε� ( = �ߺ� ���� ) ==>> System.out.print();
		// �޼ҵ��� �̸��� �ϳ��� �ְ� �Ű������� �ٸ��� �����ν�
		// �޼ҵ带 ������ ����� ���
		
		int a = 10;
		int b = 2;
		double c = 2.4;
		
		// �� ���� ������ �� �ִ� add() �����
		add(a,b);
		add(a,c);
	}
	// ������ add �Լ�
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// �������� add�޼ҵ带 �ߺ������Ͽ� ������ �޼ҵ�
	public static void add(int a, double b) {
		System.out.println(a+b);
	}
	
	// * �޼ҵ� �����ε��� ����
	// 1. �޼ҵ� �̸��� ���ƾ���
	// 2. �Ű������� ���� �Ǵ� Ÿ���� �޶����
	// 3. �Ű������� ���� ����Ÿ�Ը� �ٸ� ��� �����ε� X

	// * �����ε��� ����
	// 1. �޼ҵ��̸��� �������
	// 2. ���� �޼ҵ忡 ���� ������ �Ű������� ���� �� ����
}
