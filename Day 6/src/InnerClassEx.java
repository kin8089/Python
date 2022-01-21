
class Outer {
		 private int member=1;                         
		 
			class Inner{
		 	private int member=100;                      
			public void InnerMethod(){	
				System.out.println(member);
				System.out.println(Outer.this.member);
			}
		}
			                                  
		 public void OuterMethod(){       
			 Inner inn = new Inner();
			 inn.InnerMethod();
		}
}
	public class InnerClassEx{
		public static void main(String[] args) {
			
			//InnerŬ���� ��ü ���� ��� 1
			
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			inner.InnerMethod();
			outer.OuterMethod();
			
			//InnerŬ���� ��ü ���� ��� 2
			
			Outer.Inner inner2 = new Outer().new Inner();
			inner2.InnerMethod();
		}
	}
