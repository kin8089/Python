import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 1~100사이의 정수 입력:");
		int num = input.nextInt();
		System.out.println("두번째 1~100사이의 정수 입력:");
		int num2 = input.nextInt();
		
		System.out.println("연산자(+,-,*,/):");
		String op = input.next();             // op.CharaAt : 문자열 하나만 	, op.trim :공백제거 
		
		
		if (op.equals("+")) {                 // 문자열은 연산자 사용 불가능. equals 메서드 활용
			System.out.println(num + num2) ; 
		}
		else if (op.equals("-")) {
			System.out.println(num - num2) ; 
		}
		else if (op.equals("*")) {
			System.out.println(num * num2) ; 
		}
		else if (op.equals("/")) {
			System.out.println(num / num2) ; 
		}
	}

}
