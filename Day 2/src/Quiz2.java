import java.util.Random;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;               
		int chance = 5;
		System.out.println("1~100������ ������ ���߼���. ��ȸ�� 5���Դϴ�.");
		while (num > 0) {
			System.out.println("������ �Է�");
			int num2 = input.nextInt();
			if (num2 > num) {
				chance = chance - 1 ;
				System.out.printf("Down,%1$3d�����ҽ��ϴ�\n",chance);
			}
			else if (num2 < num) {
				chance = chance - 1 ;
				System.out.printf("Up,%1$3d�����ҽ��ϴ�\n",chance);
					
			}
			
			else {
				System.out.println("����!"); break;
			}
			if (chance == 0) {
				System.out.printf("������ %d. ������ȸ��", num); break;
				
			}
	}

}

}