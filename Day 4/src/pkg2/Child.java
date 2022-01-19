package pkg2;

import pkg1.Parent;

public class Child extends Parent{
	public void test() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Child o = new Child();
		o.test();
		
	}

}
