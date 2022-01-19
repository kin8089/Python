
public class StaticTest {

	public int num;
	public static int snum;
	
	public void method() {
		System.out.println(num);
		System.out.println(snum);
	}
	public static void staticMethod() {
		//System.out.println(num);          // static매서드만 호출 가능
		System.out.println(snum);
	}
	public void method2() {
		method();
		staticMethod();
	}
	public static void staticMethod2() {
		//method();                         // static만 호출 가능
		staticMethod();
	}
	}
