import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° 1~100������ ���� �Է�:");
		int num = input.nextInt();
		System.out.println("�ι�° 1~100������ ���� �Է�:");
		int num2 = input.nextInt();
		
		System.out.println("������(+,-,*,/):");
		String op = input.next();             // op.CharaAt : ���ڿ� �ϳ��� 	, op.trim :�������� 
		
		
		if (op.equals("+")) {                 // ���ڿ��� ������ ��� �Ұ���. equals �޼��� Ȱ��
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
