
public class For2Ex3 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			   for(int j=0;j<3;j++){
			       if (j==1) continue; //���� �ݺ� ���� Ƚ���� �����϶�� �ǹ� (�� �ݺ� ���� ������ skip)
			       System.out.println("i="+i+", j="+j);
			   }
			}

			for(int i=0;i<3;i++){
			   for(int j=0;j<3;j++){
			       if (j==1) break; //���� ����� �ݺ��� Ż��
			       System.out.println("i="+i+", j="+j);
			   }
			}
			
			
	}
}

