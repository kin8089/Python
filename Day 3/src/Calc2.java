
public class Calc2 {
	public void add (int a, int b) {}
		public double add(double x, double y) {
			return 0.0;
		}
		public void add(int a, int b, int...c) {    //가변파라미터 : 마지막에 선언해야함
//			System.out.println("add(int, int, int) called");
			System.out.println(c.length);
			for (int n : c)
				System.out.print(n+ " ");
			System.out.println();
		}
		
		public void add(int a, double b) {
			System.out.println("add(int, double) called");
		}
		
		public void add(String a, String b) {
			System.out.println("add(String , String) called");
		}
		
	public static void main(String[] args) {
		Calc2 c2 = new Calc2();
//		c2.add(1.5 , 1.5);
//		c2.add(1.5 , 2);
//		c2.add('A', 0);
		c2.add(1,2,3,4,5,6,7);
		c2.add(1 , 2, new int[]{1,2,3,4,5,6,7,8,9});
	}
	
}
