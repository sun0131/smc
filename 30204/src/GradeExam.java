import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade me = new Grade();
		System.out.println("���� ���� ���� ������ 3���� �����Է�>>");
		me.m = scanner.nextInt();
		me.s = scanner.nextInt();
		me.e = scanner.nextInt();
		System.out.println("����� "+me.average());
		
	}
	}
class Grade{
	int m, s, e;
	int average() {
		return (m+s+e)/3;
	}

}


