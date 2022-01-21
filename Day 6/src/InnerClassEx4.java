 class Outer4 {
  private int member=1;
  Animal cat = new Animal() { //클래스 선언 없이, 생성과 동시에 body 구현
	@Override
	public void move() {		 
		System.out.println("살금 살금, 점프");
	}	  
  };
  public void outerMethod(){  
	  cat.move();
  }//method end  
}
 public class InnerClassEx4 {
	public static void main(String[] args) {		 
		Outer4 outer = new Outer4();
		 outer.outerMethod();
	}
}