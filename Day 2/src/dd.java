import java.util.Random;
import java.util.Scanner;
public class dd {
    public static void main(String[] args) {
        Random random  = new Random();
        int computer = random.nextInt(100)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("UpDown Game ");
        System.out.println("���α׷��� �����Ϸ��� Q�� �Է��ϼ���.");
        while(true) {
             System.out.print("���α׷��� �����Ͻðڽ��ϱ�? ");
             String answer = input.next();
             if (answer.equals("Q") || answer.equals("q"))  {
	        System.out.print("���α׷� �����մϴ�.");
                     System.exit(0);
             }
             int count = 0,  na =0;
             while (count < 5) {
	      count += 1;
                    System.out.print("���� ������ ����? ");
                    na =  input.nextInt();
                    if (computer == na) {
		System.out.println("You Win");
		break;
                    }else if(computer > na) {
		System.out.println("Up!!!");
                    }else  if(computer < na) {
		System.out.println("Down!!!");
                    }
             }
             if (count == 5)
              System.out.printf("I Win (���� ������ ���� %d)", computer);
      }//outer while end
  }//main end
}