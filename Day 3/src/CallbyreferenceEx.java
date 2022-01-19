
public class CallbyreferenceEx {
	public void change(int[] a , int[] b) {
		int temp = a[0];
		a[0] = b[0];
		b[0] = temp;
		
	}
	public static void main(String[] args) {
		int[] x = {3}, y = {7};
		
		CallbyreferenceEx ex = new CallbyreferenceEx();
		System.out.println("x[0]="+x[0]+", y[0]="+y[0]);
		ex.change(x, y);
		System.out.println("x[0]="+x[0]+", y[0]="+y[0]);
	}

}
		