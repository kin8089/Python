
public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("start");
		int num = 2;
		try {
			num = Integer.parseInt(args[0]);
			System.out.println("다른 실행 코드");       //예외가 없을 경우 출력됨
		}catch(NumberFormatException e) {
			System.out.println("NFE 예외처리");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE 예외처리");
		}finally {                                   //무조건 실행됨
			System.out.println("resourse 정리");
		}
		
		if(num%2==0) {  //로직
			System.out.println("짝수");
		}
			else {
				System.out.println("홀수");
			}
		System.out.println("end");
		}

	}


