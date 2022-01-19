import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		dasi:
		while(true){
			System.out.print("주민번호를 입력하세요(0은 종료)");
			String juminNo = scan.nextLine();
			//if(juminNo.trim().equals{ //"0reak; // 문자열.trim() : 앞뒤공백을 제거해라
			if(juminNo.length()!=13){ // 문자열.length() : 문자열의 길이를 구한다.
				System.out.println("주민번호는 13자리 이어야 합니다.");
				continue;
			}
			for(int i=0;i<juminNo.length();i++){ // 문자열.charAt(index) : index위치의 1문자 얻기(index는 0부터)
				if(juminNo.charAt(i)<'0' || juminNo.charAt(i)>'9'){
					System.out.println("주민번호는 반드시 숫자로만 이루어져 있어야 합니다.");
					continue dasi;
				}
			}
			// 여기까지 내려오면 숫자로만 이루어진 13자리이다.
			int sum=0;
			// 1. 각각의 자리에 2 3 4 5 6 7 8 9 2 3 4 5를 곱한 합을 구한다.
			for(int i=0;i<juminNo.length()-1;i++){
				// char형을 숫자로 바꾸는 방법 : '1' - '0' = 1, '5'-'0' = 5
				// 숫자를 char형으로 바꾸는 방법 : 1 + '0' = '1' , 7 + '0' = '7'
				sum += (juminNo.charAt(i)-'0') * (i<8 ? i+2 : i-6); 
			}
			// 2. 합을 11로 나눈 나머지를 구한다.
			// 3. 11에서 나머지를 뺀다.
			// 4. 위의결과를 1으로 나눈 나머지를 구한다.
			sum = (11 - sum%11)%10;

			// 5. 위의 결과가 13번째 자리와 같다면 맞는 주민번호이다.
			// 문자열.substring(n,m) : n부터 m전까지 잘라내기, 문자열.substring(n) : n번째부터 끝까지
			System.out.print(juminNo.substring(0,6) + "-" + juminNo.substring(6) + "은 ");
			if(juminNo.charAt(12)-'0' == sum)
				System.out.println("맞는 주민번호입니다.");
			else
				System.out.println("틀린 주민번호입니다.");
		}
		// 'scan.close();
	}
}