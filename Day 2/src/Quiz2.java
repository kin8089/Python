import java.util.Random;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;               
		int chance = 5;
		System.out.println("1~100사이의 정수를 맞추세요. 기회는 5번입니다.");
		while (num > 0) {
			System.out.println("정답을 입력");
			int num2 = input.nextInt();
			if (num2 > num) {
				chance = chance - 1 ;
				System.out.printf("Down,%1$3d번남았습니다\n",chance);
			}
			else if (num2 < num) {
				chance = chance - 1 ;
				System.out.printf("Up,%1$3d번남았습니다\n",chance);
					
			}
			
			else {
				System.out.println("정답!"); break;
			}
			if (chance == 0) {
				System.out.printf("정답은 %d. 다음기회에", num); break;
				
			}
	}

}

}