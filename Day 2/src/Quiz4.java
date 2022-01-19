
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
				
			    System.out.println("정수"+i+"는 고집수"+count+"입니다");
			    total ++;
			}
			
		}
	    System.out.println("10~99사이의 고집수 4이상의 총 개수는"+total+"개 입니다");
	}

}
