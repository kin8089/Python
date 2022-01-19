import java.util.Random;
import java.util.Scanner;
public class dd {
    public static void main(String[] args) {
        Random random  = new Random();
        int computer = random.nextInt(100)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("UpDown Game ");
        System.out.println("프로그램을 종료하려면 Q를 입력하세요.");
        while(true) {
             System.out.print("프로그램을 시작하시겠습니까? ");
             String answer = input.next();
             if (answer.equals("Q") || answer.equals("q"))  {
	        System.out.print("프로그램 종료합니다.");
                     System.exit(0);
             }
             int count = 0,  na =0;
             while (count < 5) {
	      count += 1;
                    System.out.print("내가 생각한 수는? ");
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
              System.out.printf("I Win (내가 생각한 수는 %d)", computer);
      }//outer while end
  }//main end
}