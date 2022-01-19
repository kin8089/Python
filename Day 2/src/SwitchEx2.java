import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 정수 입력:");
		int num = input.nextInt();
		String grade = null;            // 로컬변수는 사용전에 반드시 초기화가 필요함. String은 null을 통해 변수만 생성가능.
		
		switch(num/10) {        //switch문에는 int크기 이하의 정수타입과 String타입 올수 있음
                                //switch문의 케이스를 줄이기 위해서 score나누기 10을 해야한다.
                          // float형이나 double형은 올 수 없기 때문에 점수에 따라서 switch 문에서는 + - 형을 추가하지 못한다.
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
