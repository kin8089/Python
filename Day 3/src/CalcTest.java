import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° 1~100������ ���� �Է�:");
		int a = input.nextInt();
		System.out.println("�ι�° 1~100������ ���� �Է�:");
		int b = input.nextInt();
		System.out.println("������� �Է�:");
		String op = input.next();  
		int r = c1.calculate(a, b, op);
				System.out.println(r);
				c1.squarePower(a, b);
	}

}
