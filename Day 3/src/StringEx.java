
public class StringEx {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.print(a==b);
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = ("java");
		String s4 = ("java");
		System.out.print(s1==s2);             //heap메모리에 각각의 객체가 생성, 두 객체의 주소값이 다름
		System.out.print(s1==s3);             //heap메모리와 string pool메모리에 생성된 객체는 주소가 다름
		System.out.print(s3==s4);	 		  //string pool은 입력받은 값이 없으면 새로 생성. 이미 입력값이 존재하면 같은 주소값을 가짐.
		
	}

}
