package test;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		int ticketprice = 8000, price=0;
		
		System.out.print("아동 수:");
		a = in.nextInt();
		
		System.out.print("성인 수:");
		b = in.nextInt();
		
		price = (ticketprice-2000)*a+ticketprice+b;
		System.out.println("총 수량:"+(a+b));
		System.out.println("금액"+price);
		
	}

}
