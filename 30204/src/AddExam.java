import java.util.Scanner;

public class AddExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b=0;
		int sum = 0;

		System.out.print("���ۡ����ڣ���");
		a = in.nextInt();
		System.out.print("�����������ڣ���");
		b = in.nextInt();
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + sum);
	}

}