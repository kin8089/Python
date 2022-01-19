
public class VariableTest {
	public int num;                //인스턴스변수 : 생성된 객체마다 각각의 값을 가짐.
	public final int PORT=5000;    //상수 : 반드시 초기화가 필수. 변경이 불가능
	public static int snum;        //클래스변수 : 메모리에 하나만 생성.
	
		
	public static void main(String[] args) {
		VariableTest test = new VariableTest();  
//		System.out.println(test.num);
//		System.out.println(test.PORT);
//		System.out.println(test.snum);
//		test.PORT = 3000;
//		test.num = 50;
//		System.out.println(test.num);
//		VariableTest test2 = new VariableTest();
//		
//		test2.num = 100;
//		System.out.println(test2.num);
		test.snum = 50;
		System.out.println(snum);
		VariableTest.snum = 100;
		System.out.println(VariableTest.snum);
		test = new VariableTest();
		System.out.println(test.snum);
		snum *= 2;
		System.out.println(snum);
		System.out.println((VariableTest.snum));
		System.out.println(test.snum);
	}
		

}
