import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		dasi:
		while(true){
			System.out.print("�ֹι�ȣ�� �Է��ϼ���(0�� ����)");
			String juminNo = scan.nextLine();
			//if(juminNo.trim().equals{ //"0reak; // ���ڿ�.trim() : �յڰ����� �����ض�
			if(juminNo.length()!=13){ // ���ڿ�.length() : ���ڿ��� ���̸� ���Ѵ�.
				System.out.println("�ֹι�ȣ�� 13�ڸ� �̾�� �մϴ�.");
				continue;
			}
			for(int i=0;i<juminNo.length();i++){ // ���ڿ�.charAt(index) : index��ġ�� 1���� ���(index�� 0����)
				if(juminNo.charAt(i)<'0' || juminNo.charAt(i)>'9'){
					System.out.println("�ֹι�ȣ�� �ݵ�� ���ڷθ� �̷���� �־�� �մϴ�.");
					continue dasi;
				}
			}
			// ������� �������� ���ڷθ� �̷���� 13�ڸ��̴�.
			int sum=0;
			// 1. ������ �ڸ��� 2 3 4 5 6 7 8 9 2 3 4 5�� ���� ���� ���Ѵ�.
			for(int i=0;i<juminNo.length()-1;i++){
				// char���� ���ڷ� �ٲٴ� ��� : '1' - '0' = 1, '5'-'0' = 5
				// ���ڸ� char������ �ٲٴ� ��� : 1 + '0' = '1' , 7 + '0' = '7'
				sum += (juminNo.charAt(i)-'0') * (i<8 ? i+2 : i-6); 
			}
			// 2. ���� 11�� ���� �������� ���Ѵ�.
			// 3. 11���� �������� ����.
			// 4. ���ǰ���� 1���� ���� �������� ���Ѵ�.
			sum = (11 - sum%11)%10;

			// 5. ���� ����� 13��° �ڸ��� ���ٸ� �´� �ֹι�ȣ�̴�.
			// ���ڿ�.substring(n,m) : n���� m������ �߶󳻱�, ���ڿ�.substring(n) : n��°���� ������
			System.out.print(juminNo.substring(0,6) + "-" + juminNo.substring(6) + "�� ");
			if(juminNo.charAt(12)-'0' == sum)
				System.out.println("�´� �ֹι�ȣ�Դϴ�.");
			else
				System.out.println("Ʋ�� �ֹι�ȣ�Դϴ�.");
		}
		// 'scan.close();
	}
}