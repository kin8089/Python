import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100������ ���� �Է�:");
		int num = input.nextInt();
		//int r = num % 2;
		
		switch(num % 2) {
		case 0 :
			System.out.printf("%1$3d�� ¦��\n",  num);
			break;
		case 1 :
			System.out.printf("%1$3d�� Ȧ��\n",  num);
			break;
		}
			
			
			
		
		 
		}
	}
