import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력:");
		int num = input.nextInt();
		//int r = num % 2;
		
		switch(num % 2) {
		case 0 :
			System.out.printf("%1$3d은 짝수\n",  num);
			break;
		case 1 :
			System.out.printf("%1$3d은 홀수\n",  num);
			break;
		}
			
			
			
		
		 
		}
	}
