import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100������ ���� �Է�:");
		int num = input.nextInt();
		String grade = null;            // ���ú����� ������� �ݵ�� �ʱ�ȭ�� �ʿ���. String�� null�� ���� ������ ��������.
		
		switch(num/10) {        //switch������ intũ�� ������ ����Ÿ�԰� StringŸ�� �ü� ����
                                //switch���� ���̽��� ���̱� ���ؼ� score������ 10�� �ؾ��Ѵ�.
                          // float���̳� double���� �� �� ���� ������ ������ ���� switch �������� + - ���� �߰����� ���Ѵ�.
		case 10 :
		case 9 :
			System.out.println("A"); break;
		case 8 :
			System.out.println("B"); break;
		case 7 :
			System.out.println("C"); break;
		case 6 :
			System.out.println("D"); break;
		default :
			System.out.println("F");
		}

	}

}
