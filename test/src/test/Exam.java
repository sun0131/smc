package test;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		int ticketprice = 8000, price=0;
		
		System.out.print("�Ƶ� ��:");
		a = in.nextInt();
		
		System.out.print("���� ��:");
		b = in.nextInt();
		
		price = (ticketprice-2000)*a+ticketprice+b;
		System.out.println("�� ����:"+(a+b));
		System.out.println("�ݾ�"+price);
		
	}

}
