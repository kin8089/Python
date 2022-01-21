import java.io.IOException;
import java.io.FileInputStream;

public class ExceptionTest3 {
	public void method1() throws IOException{
       System.out.println("method1() called");
       method2();
	}

	public void method2() throws IOException{
		System.out.println("method2() called");
		method3();
	}

	public void method3() throws IOException{
		System.out.println("method3() called");
		//메서드 처리중 예외가 발생됨을 모의
		if(true) throw new IOException("예외 발생");
	}

	public static void main(String[] args) throws IOException{
		 ExceptionTest3 test = new ExceptionTest3();
		 test.method1();
	}

}
