
public class Test2 {

	public static void main(String[] args) {    //main메소드는 멤버변수와 멤버메소드들과 다른 메소드.(소유자 클래스가 다름)
												//멤버가 아닌경우 반드시 객체 생성을 하고 사용해야함.
		boolean b;               //멤버변수, 인스턴스 변수
		int num;                 
		char ch;
		double d;
		String s;
		Test2 t2 = new Test2();    //객체생성
		
//		String s = null;		 //참조변수는 생성전에 null을 통해서 초기화를 해야함.
//		int num = 0;             //로컬변수는 사용전에 반드시 초기화 해야함
//		  System.out.println(num);		
//		  System.out.println(s);
//		  System.out.println(s.length());        //Runtime Exception발생 = 객체를 생성하지 않고 메소드를 호출하면 발생.
//	}

//		System.out.println(t2.num);
//		System.out.println(t2.s);
//		System.out.println(t2.ch);
//		System.out.println(t2.d);
//		System.out.println(t2.b);
//	
}
}
