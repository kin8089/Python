
public class Quiz3 {

	public static void main(String[] args) {
		System.out.println("=== �����ý�Ʈ�� �� ===");
	      int count=0;
	     for(int i=100;i<1000;i++){
	        int h = i/100;
	        int t = (i%100)/10;
	        int o = i%10;
	        if(i == (h*h*h+t*t*t+o*o*o)){
	           System.out.println(i);
	           count++;
	        }
	       }
	    System.out.println("�����ý�Ʈ �� �� ������ "+ count+"�Դϴ�.");
	
	}

}
