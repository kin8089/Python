import java.util.Scanner;

public class InputEx4 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("�⵵�� �Է�:");
			int num = input.nextInt();
			
			if (num % 4 == 0) {
				
				if (num % 100 == 0) {
					System.out.println("���");
			}	
				
		
				else if (num % 400 == 0) {
				System.out.println("����");
				}
				
				else {
					System.out.println("����");
				}
			
			}
			else if (num % 4 != 0) {
				System.out.println("���");
			}
			
			
			}
}	

		


