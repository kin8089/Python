import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° 1~100������ ���� �Է�:");
		int num1 = input.nextInt();
		System.out.println("�ι�° 1~100������ ���� �Է�:");
		int num2 = input.nextInt();
		int num3;
		
		System.out.println("������(+,-,*,/):");
		String op = input.next();          
	
		switch(op) {               // op.char(0) : �������� String op�� char Ÿ������ ��ȯ.
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
