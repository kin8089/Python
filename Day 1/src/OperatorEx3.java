
public class OperatorEx3 {

	public static void main(String[] args) {
		int x=3 , y=7;
	    boolean result = x>=y && x<y;
	    System.out.println(result );
	    result = x==y && x<y;
		System.out.println(result );
//		result = x> = y :: x<y;

			
		//result = x!=y;
//		System.out.println(result );
//	
//		int result2 = x&y;
//		result2 = x^y;
//		System.out.println(result2);
		
		int result2 = x<<y;
		System.out.println(result2);
		x=160; y=3;
		result2 = x>>y;
		System.out.println(result2);
		result2 = x>>>y;
		System.out.println(result2);
		x=160;
		result2 = x>>y;
		System.out.println(result2);
		result2 = x>>>y;
		System.out.println(result2);
	}

}
