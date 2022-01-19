import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 1~100사이의 정수 입력:");
		int a = input.nextInt();
		System.out.println("두번째 1~100사이의 정수 입력:");
		int b = input.nextInt();
		System.out.println("연산식을 입력:");
		String op = input.next();  
		int r = c1.calculate(a, b, op);
				System.out.println(r);
				c1.squarePower(a, b);
	}

}
