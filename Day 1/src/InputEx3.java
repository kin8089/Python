import java.util.Scanner;

public class InputEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력:");
		int num = input.nextInt();

		if (num >= 90) {
			System.out.println("A");
		}
		else if (num >= 80) {
			System.out.println("B");
	}
		else if (num >= 70) {
			System.out.println("C");
	}
		else if (num >= 60) {
			System.out.println("D");
}
		else {
			System.out.println("F");
		}
}
}