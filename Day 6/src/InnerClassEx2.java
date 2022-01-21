class Outer2 {
  private int member=1;
    static class Inner2 {
      static int member=100;
      public static void  innerMethod(){
         System.out.println(member);
     }
  }
  public void outerMethod(){
      
   }
}

public class InnerClassEx2 {
	public static void main(String[] args) {		 
		System.out.println(Outer2.Inner2.member);
		Outer2.Inner2.innerMethod();		 
	}
}
