
public class Quiz4 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i =10; i<100; i++) {
			int k = i;
			int count = 0;
			while(k>9) {
				k = k/10*(k%10);
				count ++;
				
			}
			if(count>=4) {
				
			    System.out.println("����"+i+"�� ������"+count+"�Դϴ�");
			    total ++;
			}
			
		}
	    System.out.println("10~99������ ������ 4�̻��� �� ������"+total+"�� �Դϴ�");
	}

}
