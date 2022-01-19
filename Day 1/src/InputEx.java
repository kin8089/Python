import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력:");
		int num = input.nextInt();
		// 짝수 or 홀수 판단하고 출력
		
		if (num % 2 == 1) {
			System.out.println("홀수입니다");}
		 	// System.out.printf("%1$3d은 홀수\n",  num);}
			else  {
				System.out.println("짝수입니다");}
				
	}

}
