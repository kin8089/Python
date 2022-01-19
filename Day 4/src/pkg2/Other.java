package pkg2;

import pkg1.Parent;

public class Other {
	public void test() {
		Parent p = new Parent();
		System.out.println(p.name);
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.test();
		
	}
}
