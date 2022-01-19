import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 1~100사이의 정수 입력:");
		int num1 = input.nextInt();
		System.out.println("두번째 1~100사이의 정수 입력:");
		int num2 = input.nextInt();
		int num3;
		
		System.out.println("연산자(+,-,*,/):");
		String op = input.next();          
	
		switch(op) {               // op.char(0) : 연산자인 String op를 char 타입으로 변환.
//		case "+" :
//			System.out.println(num + num2) ;
//			break;
//		case "-" :
//			num3 = num - num2;
//			System.out.println(num3) ;
//			break;
//		case "*" :
//			System.out.println(num * num2) ;
//			break;
//		case "/" :
//			System.out.println(num / num2) ;
//			break;
		case "+" : System.out.printf("%1$3d + %2$3d =%3$3d\n",  num1, num2, (num1+num2)); break;       
        case "-" :System.out.printf("%1$3d - %2$3d =%3$3d\n",  num1, num2, (num1-num2));  break;      
        case "*" :System.out.printf("%1$3d X %2$3d =%3$3d\n",  num1, num2, (num1*num2)); break;       
        case "/" : System.out.printf("%1$3d / %2$3d =%3$3d\n",  num1, num2, (num1/num2));break;
			
			
		}
	}

}
