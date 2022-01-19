
public class CallbyvauleEx {
	public void change(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	public static void main(String[] args) {
		int x = 3, y = 7;
		
		CallbyvauleEx ex = new CallbyvauleEx();
		System.out.println("x="+x+", y="+y);
		ex.change(x, y);
		System.out.println("x="+x+", y="+y);
	}

}
