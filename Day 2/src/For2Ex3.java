
public class For2Ex3 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			   for(int j=0;j<3;j++){
			       if (j==1) continue; //다음 반복 수행 횟차로 진행하라는 의미 (현 반복 수행 문장은 skip)
			       System.out.println("i="+i+", j="+j);
			   }
			}

			for(int i=0;i<3;i++){
			   for(int j=0;j<3;j++){
			       if (j==1) break; //가장 가까운 반복문 탈출
			       System.out.println("i="+i+", j="+j);
			   }
			}
			
			
	}
}

