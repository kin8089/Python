import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100������ ���� �Է�:");
		int num = input.nextInt();
		// ¦�� or Ȧ�� �Ǵ��ϰ� ���
		
		if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");}
		 	// System.out.printf("%1$3d�� Ȧ��\n",  num);}
			else  {
				System.out.println("¦���Դϴ�");}
				
	}

}
