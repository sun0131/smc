import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int max=0;
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"�� �Է�: ");
			arr[i]=in.nextInt();
			
		}
		
		for(int i=0;i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				j=i+1;
			}
		}
		System.out.println("���� ū ���� "+j+"��° ������"+max);
	}

}
