import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력:");
		int num = input.nextInt();
		int sum = 0;
		
		for (int i = 1; i<num; i++) {
			if(num % i == 0) {
			
			sum = sum + i;
			System.out.println(i + ",");
			
			
			}
		}
			System.out.println(sum);

	}
}
