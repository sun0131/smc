import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade me = new Grade();
		System.out.println("수학 과학 영어 순으로 3개의 점수입력>>");
		me.m = scanner.nextInt();
		me.s = scanner.nextInt();
		me.e = scanner.nextInt();
		System.out.println("평균은 "+me.average());
		
	}
	}
class Grade{
	int m, s, e;
	int average() {
		return (m+s+e)/3;
	}

}


